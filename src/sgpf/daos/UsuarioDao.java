package sgpf.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sgpf.database.DatabaseConnection;

public class UsuarioDao {
    public boolean registrarUsuario(String nombres, String apellidos, String cedula, String correo, String contrasena) {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = DatabaseConnection.getConnection();

            String sql = "INSERT INTO usuarios (nombres, apellidos, cedula, correo, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?)";
            ps = conexion.prepareStatement(sql);

            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, cedula);
            ps.setString(4, correo);
            ps.setString(5, contrasena);
            ps.setString(6, "Vendedor");

            // Ejecutar la consulta y devolver true si se insertó correctamente
            int filasInsertadas = ps.executeUpdate();
            return filasInsertadas > 0;

        } catch (SQLException e) {
            System.err.println("Error al registrar el usuario: " + e.getMessage());
            return false;

        } finally {
            try {
                // Cerrar el PreparedStatement
                if (ps != null) ps.close();

                // No cerramos la conexión aquí, ya que es administrada por DatabaseConnection
            } catch (SQLException e) {
                System.err.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }

    public boolean IniciarSesion(String correo, String contrasena) {
        Connection conexion = null;
        PreparedStatement ps = null;

        try {
            conexion = DatabaseConnection.getConnection();

            String sql = "SELECT COUNT(*) FROM usuarios WHERE correo = ? AND contrasena = ?";
            ps = conexion.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, contrasena);

            java.sql.ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int total = rs.getInt(1); // Acceso por índice de columna
                return total > 0; // Retorna true si se encontró al menos un usuario
            }
            return false;

        } catch (SQLException e) {
            System.err.println("Error al iniciar sesión: " + e.getMessage());
            return false;

        } finally {
            try {
                // Cerrar el PreparedStatement
                if (ps != null) ps.close();

                // No cerramos la conexión aquí, ya que es administrada por DatabaseConnection
            } catch (SQLException e) {
                System.err.println("Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }

}
