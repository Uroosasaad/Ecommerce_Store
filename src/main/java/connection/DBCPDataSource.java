package connection;
import org.apache.commons.dbcp2.BasicDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
public class DBCPDataSource {
    private static String JDBC_URL = "";
    private static String USERNAME = "";
    private static String PASSWORD = "";
    public static String getJdbcUrl() { return JDBC_URL; }
    public static void setJdbcUrl(String jdbcUrl) {
        JDBC_URL = jdbcUrl;
    }
    public static String getUSERNAME() { return USERNAME; }
    public static void setUSERNAME(String USERNAME) {
        DBCPDataSource.USERNAME = USERNAME;
    }
    public static String getPASSWORD() {
        return PASSWORD;
    }
    public static void setPASSWORD(String PASSWORD) {
        DBCPDataSource.PASSWORD = PASSWORD;
    }
    private static BasicDataSource ds = new BasicDataSource();
    static {
        loadSettings();
        ds.setUrl(getJdbcUrl());
        ds.setUsername(getUSERNAME());
        ds.setPassword(getPASSWORD());
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
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
        setUSERNAME(prop.getProperty("app.username"));
        setPASSWORD(prop.getProperty("app.password"));
        setJdbcUrl(prop.getProperty("app.jdbcMySQLURL"));
    }
}