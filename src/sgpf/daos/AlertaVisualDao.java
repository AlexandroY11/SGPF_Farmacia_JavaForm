/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sgpf.daos;

/**
 *
 * @author Brayan Hurtado
 */
import sgpf.models.AlertaVisual;
import sgpf.models.Lote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sgpf.database.DatabaseConnection;

public class AlertaVisualDao {
    private static final String SELECT_ALERTAS = 
        "SELECT l.id_lote, l.nombre_lote, l.cantidad, " +
        "CASE " +
        "    WHEN l.cantidad < 10 THEN 'Rojo' " +
        "    WHEN l.cantidad < 20 THEN 'Amarillo' " +
        "    ELSE 'Verde' " +
        "END AS color " +
        "FROM lote l";

    // Obtener alertas basadas en los umbrales
    public List<AlertaVisual> generarAlertas(int umbralCritico, int umbralAdvertencia) {
        List<AlertaVisual> alertas = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SELECT_ALERTAS)) {

            stmt.setInt(1, umbralCritico);
            stmt.setInt(2, umbralAdvertencia);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String mensaje = "Lote: " + rs.getString("nombre_lote") + 
                                     ", Cantidad: " + rs.getInt("cantidad");
                    alertas.add(new AlertaVisual(
                        rs.getInt("idLote"),
                        rs.getString("color"),
                        mensaje
                    ));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alertas;
    }
}
