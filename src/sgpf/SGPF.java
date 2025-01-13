package sgpf;

import sgpf.database.DatabaseConnection;
import java.sql.Connection;

public class SGPF {

    public static void main(String[] args) {
        try {
            // Probar la conexión a la base de datos
            Connection conn = DatabaseConnection.getConnection();
            // Si todo está bien, puedes realizar operaciones aquí (opcional)
            
            // Cerrar la conexión
            DatabaseConnection.closeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
