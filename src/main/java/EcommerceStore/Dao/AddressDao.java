package EcommerceStore.Dao;

import EcommerceStore.Entities.Address;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class AddressDao extends AbstractDao<Address> implements DAODelete<Address> {
    @Override
    public Address getById(int id) {
        String SQL_SELECT = "Select * from addresses where address_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Address(rs.getLong("address_id"), rs.getString("street"),
                        rs.getString("city"), rs.getString("state"),
                        rs.getLong("zip_code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Address> getAll() {
        List<Address> addresses = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from addresses";
        ResultSet rs = null;
        try (PreparedStatement ps = this.executePrepareStatement(SQL_SELECT_ALL))  {
            rs = ps.executeQuery();
            while (rs.next()) {
                addresses.add(new Address(rs.getInt("address_id"), rs.getString("street"),
                        rs.getString("city"), rs.getString("state"), rs.getLong("zip_code")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return addresses;
    }
    @Override
    public void create(Address address) {
        String SQL_INSERT = "Insert into addresses(street,city,state,zip_code) values(?,?,?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setString(1, address.getStreet());
            ps.setString(2, address.getCity());
            ps.setString(3, address.getState());
            ps.setLong(4, address.getZipCode());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void update(Address address) {
        String SQL_UPDATE = "Update addresses set street,city=?,state=?,zip_code=? where address_id=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_UPDATE)) {
            ps.setString(1, address.getStreet());
            ps.setString(2, address.getCity());
            ps.setString(3, address.getState());
            ps.setLong(4,address.getZipCode());
            ps.setLong(5, address.getAddressId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void delete(Address address) {
        String SQL_DELETE = "Delete from addresses where address_id=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_DELETE)) {
            ps.setLong(1, address.getAddressId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}