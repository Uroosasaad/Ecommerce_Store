package Services.ServiceImpl;

import Dao.ProductDao;
import Entities.Product;
import Services.CRUService;
import Services.DeleteService;

import java.util.List;

public class ProductService implements CRUService<Product>, DeleteService<Product> {

    ProductDao productDao = null;

    public ProductService(ProductDao productDao) {
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
    public void update(Product product) {
        productDao.update(product);

    }

    @Override
    public void delete(Product product) {

    }
}
