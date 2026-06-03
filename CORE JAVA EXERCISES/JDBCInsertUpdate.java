import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertUpdate {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";
        try (Connection conn = DriverManager.getConnection(url)) {
            String insert = "INSERT INTO students(id,name) VALUES(?,?)";
            try (PreparedStatement ps = conn.prepareStatement(insert)) {
                ps.setInt(1,1); ps.setString(2,"Alice"); ps.executeUpdate();
            }
            String update = "UPDATE students SET name=? WHERE id=?";
            try (PreparedStatement ps = conn.prepareStatement(update)) {
                ps.setString(1,"Alicia"); ps.setInt(2,1); ps.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("JDBC error: " + e.getMessage());
        }
    }
}
