package ServiceImpl;

import Dao.ProductDao;
import Entities.Product;
import Services.DAOService;

import java.util.List;

public class ProductDAOImpl implements DAOService<Product> {

    ProductDao productDao = null;

    public ProductDAOImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product getById(int id) {
        return productDao.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public void create(Product product) {
        productDao.create(product);

    }

    @Override
    public void update(Product product, String[] params) {
        productDao.update(product, params);

    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);

    }
}
