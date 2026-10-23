import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Shared MySQL connection settings for the Library Management System.
 * Default values match a local XAMPP install (user "root", no password).
 */
public final class DB {

    private static final String URL = "jdbc:mysql://localhost:3306/library?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private DB() {
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
