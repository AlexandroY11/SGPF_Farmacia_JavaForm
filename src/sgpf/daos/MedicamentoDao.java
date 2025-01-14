package sgpf.daos;

import sgpf.database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import sgpf.models.Medicamento;

public class MedicamentoDao {

    // SQL queries
    private static final String SELECT_ALL = "SELECT * FROM medicamentos";
    private static final String SELECT_BY_ID = "SELECT * FROM medicamentos WHERE id_medicamento = ?";
    private static final String INSERT = "INSERT INTO medicamentos (nombre, codigo_barras, foto, stock_minimo, created_at, updated_at) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE medicamentos SET nombre = ?, codigo_barras = ?, foto = ?, especificaciones = ?, stock_minimo = ?, updated_at = ? WHERE id_medicamento = ?";
    private static final String DELETE = "DELETE FROM medicamentos WHERE id_medicamento = ?";

    // Obtener todos los medicamentos
    public List<Medicamento> obtenerTodos() {
        List<Medicamento> medicamentos = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Medicamento medicamento = new Medicamento(
                        rs.getInt("id_medicamento"),
                        rs.getString("nombre"),
                        rs.getString("codigo_barras"),
                        rs.getString("foto"),
                        rs.getInt("stock_minimo"),
                        rs.getString("created_at"),
                        rs.getString("updated_at")
                );
                medicamentos.add(medicamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamentos;
    }

    // Obtener un medicamento por ID
    public Medicamento obtenerPorId(int id) {
        Medicamento medicamento = null;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID)) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    medicamento = new Medicamento(
                            rs.getInt("id_medicamento"),
                            rs.getString("nombre"),
                            rs.getString("codigo_barras"),
                            rs.getString("foto"),
                            rs.getInt("stock_minimo"),
                            rs.getString("created_at"),
                            rs.getString("updated_at")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }

    // Insertar un nuevo medicamento
    public boolean insertar(Medicamento medicamento) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(INSERT)) {

            stmt.setString(1, medicamento.getNombre());
            stmt.setString(2, medicamento.getCodigoBarras());
            stmt.setString(3, medicamento.getFoto());
            stmt.setInt(5, medicamento.getStockMinimo());
            stmt.setString(6, medicamento.getCreatedAt());
            stmt.setString(7, medicamento.getUpdatedAt());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Actualizar un medicamento existente
    public boolean actualizar(Medicamento medicamento) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(UPDATE)) {

            stmt.setString(1, medicamento.getNombre());
            stmt.setString(2, medicamento.getCodigoBarras());
            stmt.setString(3, medicamento.getFoto());
            stmt.setInt(5, medicamento.getStockMinimo());
            stmt.setString(6, medicamento.getUpdatedAt());
            stmt.setInt(7, medicamento.getIdMedicamento());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Eliminar un medicamento por ID
    public boolean eliminar(int id) {
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(DELETE)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
