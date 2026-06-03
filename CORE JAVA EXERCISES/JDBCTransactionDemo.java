import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCTransactionDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:bank.db";
        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false);
            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id=?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id=?")) {
                debit.setDouble(1,100); debit.setInt(2,1); debit.executeUpdate();
                credit.setDouble(1,100); credit.setInt(2,2); credit.executeUpdate();
                conn.commit();
                System.out.println("Transfer successful");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Transfer failed, rolled back: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("JDBC error: " + e.getMessage());
        }
    }
}
