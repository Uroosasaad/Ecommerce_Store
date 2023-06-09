package ServiceImpl;

import Dao.CartDao;
import Entities.Cart;
import Services.DAOService;

import java.util.List;

public class CartDAOImpl implements DAOService<Cart> {

    CartDao cartDao = null;

    public CartDAOImpl(CartDao cartDao) {
        this.cartDao = cartDao;
    }

    @Override
    public Cart getById(int id) {
        return cartDao.getById(id);
    }

    @Override
    public List<Cart> getAll() {
        return cartDao.getAll();
    }

    @Override
    public void create(Cart cart) {
        cartDao.create(cart);

    }

    @Override
    public void update(Cart cart, String[] params) {
        cartDao.update(cart, params);

    }

    @Override
    public void delete(Cart cart) {
        cartDao.delete(cart);

    }
}
