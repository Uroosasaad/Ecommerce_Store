package ServiceImpl;

import Dao.CategoryDao;
import Entities.Category;
import Services.DAOService;

import java.util.List;

public class CategoryDAOImpl implements DAOService<Category> {

    CategoryDao categoryDao = null;

    @Override
    public Category getById(int id) {
        return categoryDao.getById(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    @Override
    public void create(Category category) {
        categoryDao.create(category);

    }

    @Override
    public void update(Category category, String[] params) {
        categoryDao.update(category, params);

    }

    @Override
    public void delete(Category category) {
        categoryDao.delete(category);

    }
}
