package sgpf.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sgpf.database.DatabaseConnection;
import sgpf.models.Lote;


public class LoteDao {
    
    private static final String SELECT_ALL = "SELECT * FROM lotes";
    
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
    
    public List<Lote> obtenerTodos() {
        List<Lote> lotes = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);
             ResultSet rs = stmt.executeQuery()) {

            // Usar rs.next() para mover el cursor a la primera fila
            while (rs.next()) {
                Lote lote = new Lote(
                    rs.getInt("id_lote"),
                    rs.getString("nombre_lote"),
                    rs.getInt("id_medicamento"),
                    rs.getInt("cantidad"),
                    rs.getString("fecha_vencimiento"),
                    rs.getString("created_at")
                );
                lotes.add(lote);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lotes;
    }

}
