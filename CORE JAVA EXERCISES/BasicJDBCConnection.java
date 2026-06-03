import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBCConnection {
    public static void main(String[] args) {
        // Requires JDBC driver on classpath and a local database configured.
        String url = "jdbc:sqlite:students.db"; // example using SQLite
        try (Connection conn = DriverManager.getConnection(url);
             Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery("SELECT name FROM students");
            while (rs.next()) System.out.println(rs.getString(1));
        } catch (Exception e) {
            System.out.println("JDBC error: " + e.getMessage());
        }
    }
}
