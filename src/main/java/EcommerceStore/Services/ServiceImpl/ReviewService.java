package EcommerceStore.Services.ServiceImpl;
import mainEcommerce.Dao.ReviewDao;
import EcommerceStore.Entities.Review;
import EcommerceStore.Services.CRUService;
import EcommerceStore.Services.DeleteService;
import java.util.List;
public class ReviewService implements CRUService<Review>, DeleteService<Review> {
    ReviewDao reviewDao = null;
    public ReviewService(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }
    @Override
    public Review getById(int id) {
        return reviewDao.getById(id);
    }
    @Override
    public List<Review> getAll() {
        return reviewDao.getAll();
    }
    @Override
    public void create(Review review) {
        reviewDao.create(review);
    }
    @Override
    public void update(Review review) {
        reviewDao.update(review);
    }
    @Override
    public void delete(Review review) {
        reviewDao.delete(review);
    }
}