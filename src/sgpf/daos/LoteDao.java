package sgpf.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sgpf.database.DatabaseConnection;


public class LoteDao {
    public boolean crearLote(String nombre, int cantidad, int medicamento, String fechaVencimiento) {
        String sql = "INSERT INTO lotes (nombre_lote, id_medicamento, cantidad, fecha_vencimiento, created_at, updated_at) VALUES (?, ?, ?, ?, NOW(), NOW())";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setInt(2, medicamento);
            stmt.setInt(3, cantidad);
            stmt.setString(4, fechaVencimiento);

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            System.err.println("Error al insertar el lote: " + e.getMessage());
            return false;
        }
    }
}
