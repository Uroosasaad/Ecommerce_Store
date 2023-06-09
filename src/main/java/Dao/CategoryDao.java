package Dao;

import Entities.Category;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao extends AbstractDao<Category> {

    @Override
    public Category getById(int id) {
        String SQL_SELECT = "Select * from category where category_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Category(rs.getLong("category_id"), rs.getString("category_name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from category";
        PreparedStatement ps = null;
        ResultSet rs = null;
         try {
            ps = this.executePrepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                categories.add(new Category(rs.getLong("category_id"), rs.getString("category_name")));
            }
            if (rs != null && !rs.isClosed())
                rs.close();
            if (ps != null && !ps.isClosed())
                ps.getConnection().close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public void create(Category category) {
        String SQL_INSERT = "Insert into categories (category_id, customer_name,) values(?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Category category, String[] params) {
        String SQL_UPDATE = "Update category set category_id=?,category_name=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_UPDATE)) {
            ps.setString(1, params[0]);
            ps.setLong(2, category.getCategoryId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Category category) {
        String SQL_DELETE = "Delete from category where category_id=?";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_DELETE)) {
            ps.setLong(1, category.getCategoryId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


