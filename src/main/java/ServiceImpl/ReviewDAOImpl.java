package ServiceImpl;

import Dao.ReviewDao;
import Entities.Review;
import Services.DAOService;

import java.util.List;

public class ReviewDAOImpl implements DAOService<Review> {

    ReviewDao reviewDao = null;

    public ReviewDAOImpl(ReviewDao reviewDao) {
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
    public void update(Review review, String[] params) {
        reviewDao.update(review, params);

    }

    @Override
    public void delete(Review review) {
        reviewDao.delete(review);

    }
}
