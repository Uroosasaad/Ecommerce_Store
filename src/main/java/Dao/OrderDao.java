package Dao;
import Entities.Order;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class OrderDao extends AbstractDao<Order> implements DAODelete<Order>{
    @Override
    public Order getById(int id) {
        String SQL_SELECT = "Select * from orders where order_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Order(rs.getLong("order_id"), rs.getLong("customer_id"),
                        rs.getDate("order_date"),
                        rs.getLong("total_amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<Order> getAll() {
        List<Order> orders = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from orders";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                orders.add(new Order(rs.getLong("order_id"),rs.getLong("customer_id"),
                        rs.getDate("order_date"),  rs.getLong("total_amount")
                ));
            }
            return orders;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void create(Order order) {
        String SQL_INSERT = "Insert into orders (customer_id, order_date, total_amount) values(?,?,?)";
        try (PreparedStatement ps= this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, order.getCustomerId());
            ps.setDate(2, order.getOrderDate());
            ps.setLong(3, order.getTotalAmount());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void update(Order order) {
        String SQL_UPDATE="Update orders set order_date=?,customer_id=?, total_amount=? where order_id=?";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_UPDATE)){
            ps.setDate(1, order.getOrderDate());
            ps.setLong(2, order.getCustomerId());
            ps.setLong(3,order.getTotalAmount());
            ps.setLong(5,order.getOrderId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void delete(Order order) {
        String SQL_DELETE="Delete from orders where order_id=?";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_DELETE)){
            ps.setLong(1, order.getOrderId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}