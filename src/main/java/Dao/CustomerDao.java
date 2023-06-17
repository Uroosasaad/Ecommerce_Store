package Dao;
import Entities.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao extends AbstractDao<Customer>{


    @Override
    public Customer getById(int id) {
        String SQL_SELECT = "Select * from customers where customer_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Customer(rs.getLong("customer_id"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("email"),
                        rs.getLong("address_Id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from customers";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                customers.add(new Customer(rs.getInt("customer_id"),rs.getString("first_name"),
                        rs.getString("last_name"), rs.getString("email"), rs.getLong("addressId")
                ));
            }
            return customers;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public void create(Customer customer) {
        String SQL_INSERT = "Insert into customers(customer_id,first_name,last_name,email,address_Id) values(?,?,?,?,?)";
        try (PreparedStatement ps= this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, customer.getCustomerId());
            ps.setString(2, customer.getFirstName());
            ps.setString(3, customer.getLastName());
            ps.setString(4, customer.getEmail());
            ps.setLong(5, customer.getAddressId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Customer customer) {
        String SQL_UPDATE="Update customers set first_name=?,last_name=?,email=? where customer_id=?";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_UPDATE)){
            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getEmail());
            ps.setLong(5,customer.getCustomerId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }


}
