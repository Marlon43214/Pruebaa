import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {

    public static void main(String[] args) {

        String urlMysql = "jdbc:mysql://localhost:3306/covid";

        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(urlMysql, "root", "admin");
            System.out.println("se extablecio la conexión");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
