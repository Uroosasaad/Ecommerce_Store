package Dao;

import Entities.Address;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressDao extends AbstractDao<Address> {
    @Override
    public Address getById(int id) {
        String SQL_SELECT = "Select * from address where address_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Address(rs.getLong("address_id"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("email"),
                        rs.getLong("addressId"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Address> getAll() {
        List<Address> addresses = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from address";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = this.executePrepareStatement(SQL_SELECT_ALL);
              rs = ps.executeQuery();
            while (rs.next()) {
                addresses.add(new Address(rs.getInt("address_id"), rs.getString("street"),
                        rs.getString("city"), rs.getString("state"), rs.getLong("zip_code")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }

        return addresses;
    }

    @Override
    public void create(Address address) {
        String SQL_INSERT = "Insert into address(address_id,street,city,state,zip_code) values(?,?,?,?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, address.getAddressId());
            ps.setString(2, address.getStreet());
            ps.setString(3, address.getCity());
            ps.setString(4, address.getState());
            ps.setLong(5, address.getZipCode());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Address address, String[] params) {
        String SQL_UPDATE = "Update address set address_id=?,street,city=?,state=?,zip_code=? where address_id=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_UPDATE)) {
            ps.setString(1, params[0]);
            ps.setString(2, params[1]);
            ps.setString(3, params[2]);
            ps.setString(4, params[3]);
            ps.setLong(5, address.getAddressId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Address address) {
        String SQL_DELETE = "Delete from address where address_id=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_DELETE)) {
            ps.setLong(1, address.getAddressId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


