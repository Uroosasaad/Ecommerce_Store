package Dao;

import Entities.CartItem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartItemDao extends AbstractDao<CartItem> {

    @Override
    public CartItem getById(int id) {
        String SQL_SELECT = "Select * from cart_items where cart_item_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new CartItem(rs.getLong("cart_item_id"), rs.getLong("cart_id"),
                        rs.getLong("product_id"),
                        rs.getLong("quantity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CartItem> getAll() {
        List<CartItem> cartItems = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from cart_items";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                cartItems.add(new CartItem(rs.getLong("cart_item_id"),rs.getLong("cart_id"),
                        rs.getLong("product_id"),  rs.getLong("quantity")
                ));
            }
            return cartItems;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(CartItem cartItem) {
        String SQL_INSERT = "Insert into cart_items (cart_item_id, cart_id, product_id, quantity) values(?,?,?,?)";
        try (PreparedStatement ps= this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, cartItem.getCartItemId());
            ps.setLong(2, cartItem.getCartId());
            ps.setLong(3, cartItem.getProductId());
            ps.setLong(4, cartItem.getQuantity());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(CartItem cartItem) {
        String SQL_UPDATE="Update cart_items set cart_id=?,product_id=?, quantity=? where cart_item_id=?";
        try (PreparedStatement ps= this.executePrepareStatement(SQL_UPDATE)) {
            ps.setLong(1, cartItem.getCartId());
            ps.setLong(2, cartItem.getProductId());
            ps.setLong(3, cartItem.getQuantity());
            ps.setLong(4, cartItem.getCartItemId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

}
