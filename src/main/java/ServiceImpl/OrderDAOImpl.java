package ServiceImpl;

import Dao.OrderDao;
import Entities.Order;
import Services.DAOService;

import java.util.List;

public class OrderDAOImpl implements DAOService<Order> {

    OrderDao orderDao = null;

    public OrderDAOImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public Order getById(int id) {
        return orderDao.getById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }

    @Override
    public void create(Order order) {
        orderDao.create(order);

    }

    @Override
    public void update(Order order, String[] params) {
        orderDao.update(order, params);

    }

    @Override
    public void delete(Order order) {
        orderDao.delete(order);

    }
}
