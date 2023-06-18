package Dao;
import Entities.Product;
import Entities.Review;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ReviewDao extends AbstractDao<Review> implements DAODelete<Review> {
    @Override
    public Review getById(int id) {
        String SQL_SELECT = "Select * from reviews where review_id=?";
        try (PreparedStatement preparedStatement = this.executePrepareStatement(SQL_SELECT)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                return new Review(rs.getLong("review_id"), rs.getLong("customer_id"),
                        rs.getLong("product_id"),
                        rs.getLong("rating"), rs.getString("Comment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Review> getAll() {
        List<Review> reviews = new ArrayList<>();
        String SQL_SELECT_ALL = "Select * from reviews";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_SELECT_ALL)) {
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                reviews.add(new Review(rs.getLong("review_id"),rs.getLong("customer_id"),
                        rs.getLong("product_id"),  rs.getLong("rating"), rs.getString("Comment")
                ));
            }
            return reviews;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void create(Review review) {
        String SQL_INSERT = "Insert into reviews (review_id, customer_id, product_id, rating, Comment) values(?,?,?,?,?)";
        try (PreparedStatement ps = this.executePrepareStatement(SQL_INSERT)) {
            ps.setLong(1, review.getReviewId());
            ps.setLong(2, review.getCustomerId());
            ps.setLong(3, review.getProductId());
            ps.setLong(4, review.getRating());
            ps.setString(5, review.getComment());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void update(Review review) {
        String SQL_UPDATE="Update reviews set customer_id=?,product_id=?, rating=?, comment=? where review_id=?";
        try (PreparedStatement ps =this.executePrepareStatement(SQL_UPDATE)){
            ps.setLong(1, review.getCustomerId());
            ps.setLong(2, review.getProductId());
            ps.setLong(3, review.getRating());
            ps.setString(4, review.getComment());
            ps.setLong(4, review.getReviewId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void delete(Review review) {
        String SQL_DELETE="Delete from reviews where review_id=?";
        try (PreparedStatement ps=this.executePrepareStatement(SQL_DELETE)){
            ps.setLong(1, review.getReviewId());
            ps.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}