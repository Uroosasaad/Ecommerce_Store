package EcommerceStore.Dao;
import connection.DBCPDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public abstract class AbstractDao<T> implements DAOInterface<T> {
    protected PreparedStatement executePrepareStatement(String sql) throws SQLException {
        Connection con = DBCPDataSource.getConnection();
        return con.prepareStatement(sql);
    }
 }