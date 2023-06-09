package Dao;

import Entities.Cart;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDao extends AbstractDao<Cart> {

    @Override
    public Cart getById(int id) {
        String SQL_SELECT = "Select * from cart where cart_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Cart(rs.getLong("cart_id"),rs.getLong("customer_Id"), rs.getDate("created_date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cart> getAll() {
        List<Cart> carts = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from carts";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = this.executePrepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while(rs.next()){
                carts.add(new Cart(rs.getLong("cart_id"),rs.getLong("customer_id"),rs.getDate("created_date")));

            }
            if (rs != null && !rs.isClosed())
                rs.close();
            if (ps != null && !ps.isClosed())
                ps.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
        return carts;
    }

    @Override
    public void create(Cart cart) {
        String SQL_INSERT = "Insert into cart(cart_id,customer_id,created_date) values(?,?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, cart.getCartId());
            ps.setLong(2, cart.getCustomerId());
            ps.setDate(3, cart.getCreatedDate());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Cart cart, String[] params) {
        String SQL_UPDATE="Update cart set cart_id=?,customer_id=?,created_date=? where cart_id=?";
        try(PreparedStatement ps=this.executePrepareStatement(SQL_UPDATE)){

            ps.setLong(1, cart.getCartId());
            ps.setLong(2, cart.getCustomerId());
            ps.setDate(3, cart.getCreatedDate());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Cart cart) {
        String SQL_DELETE="Delete from cart where cart_id=?";
        try(PreparedStatement ps = this.executePrepareStatement(SQL_DELETE)){
            ps.setLong(1, cart.getCartId());
            ps.setLong(2, cart.getCustomerId());
            ps.setDate(3, cart.getCreatedDate());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}



