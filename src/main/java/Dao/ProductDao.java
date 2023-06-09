package Dao;

import Entities.CartItem;
import Entities.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends AbstractDao<Product>{

    @Override
    public Product getById(int id) {
        String SQL_SELECT = "Select * from product where product_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Product(rs.getLong("product_id"), rs.getString("product_name"),
                        rs.getLong("product_price"),
                        rs.getLong("category_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from products";
        try(PreparedStatement ps=this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                products.add(new Product(rs.getLong("product_id"),rs.getString("product_name"),
                        rs.getLong("product_price"),  rs.getLong("category_id")
                ));
            }
            return products;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(Product product) {
        String SQL_INSERT = "Insert into products (product_id, product_name, product_price, category_id) values(?,?,?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, product.getProductId());
            ps.setString(2, product.getProductName());
            ps.setLong(3, product.getPrice());
            ps.setLong(4, product.getCategoryId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Product product, String[] params) {
        String SQL_UPDATE="Update product set product_id,=?,product_name=?,product_price=?, category_id=? where product_id=?";
        try(PreparedStatement ps =this.executePrepareStatement(SQL_UPDATE)){
            ps.setString(1, params[0]);
            ps.setString(2, params[1]);
            ps.setString(3, params[2]);
            ps.setString(4, params[3]);
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Product product) {
        String SQL_DELETE="Delete from product where product_id=?";
        try(PreparedStatement ps=this.executePrepareStatement(SQL_DELETE)){
            ps.setLong(1,product.getProductId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}

