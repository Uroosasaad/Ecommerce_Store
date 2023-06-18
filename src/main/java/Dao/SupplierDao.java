package Dao;
import Entities.Supplier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class SupplierDao extends AbstractDao<Supplier>{
    @Override
    public Supplier getById(int id) {
        String SQL_SELECT = "Select * from suppliers where supplier_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Supplier(rs.getLong("supplier_id"), rs.getString("supplier_name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Supplier> getAll() {
        List<Supplier> suppliers = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from suppliers";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                suppliers.add(new Supplier(rs.getLong("supplier_id"),rs.getString("supplier_name")
                ));
            }
            return suppliers;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void create(Supplier supplier) {
        String SQL_INSERT = "Insert into suppliers (supplier_id, supplier_name,) values(?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, supplier.getSupplierId());
            ps.setString(2, supplier.getSupplierName());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void update(Supplier supplier) {
        String SQL_UPDATE = "Update suppliers set supplier_name=? where supplier_id=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_UPDATE)) {
            ps.setString(1, supplier.getSupplierName());
            ps.setLong(2, supplier.getSupplierId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}