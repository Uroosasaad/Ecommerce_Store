package connection;
import org.apache.commons.dbcp2.BasicDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
public class DBCPDataSource {
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/ecommerce_store";
    private static String USERNAME = "tester";
    private static String PASSWORD = "Pass123#d";
    private static BasicDataSource ds = new BasicDataSource();
    static {
        ds.setUrl(JDBC_URL);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    private DBCPDataSource(){
        loadSettings();
    }
    public static void loadSettings() {
        Properties prop = new Properties();
        String fileName = "app.config";
        try (InputStream input = DBCPDataSource.class.getClassLoader().getResourceAsStream(fileName)) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        DBCPDataSource.USERNAME = prop.getProperty("app.username");
        DBCPDataSource.PASSWORD = prop.getProperty("app.password");
        DBCPDataSource.JDBC_URL = prop.getProperty("app.jdbcMySQLURL") + prop.getProperty("app.jdbcMySQLDbName");
    }
}