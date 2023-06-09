package ServiceImpl;

import Dao.CartDao;
import Dao.CartItemDao;
import Entities.Cart;
import Entities.CartItem;
import Services.DAOService;

import java.util.List;

public class CartItemDAOImpl implements DAOService<CartItem> {

    CartItemDao cartItemDao = null;

    public CartItemDAOImpl(CartItemDao cartItemDao) {
        this.cartItemDao = cartItemDao;
    }


    @Override
    public CartItem getById(int id) {
        return cartItemDao.getById(id);
    }

    @Override
    public List<CartItem> getAll() {
        return cartItemDao.getAll();
    }

    @Override
    public void create(CartItem cartItem) {
        cartItemDao.create(cartItem);

    }

    @Override
    public void update(CartItem cartItem, String[] params) {
        cartItemDao.update(cartItem, params);

    }

    @Override
    public void delete(CartItem cartItem) {
        cartItemDao.delete(cartItem);

    }
}
