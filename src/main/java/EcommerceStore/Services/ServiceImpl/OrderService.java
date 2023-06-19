package EcommerceStore.Services.ServiceImpl;
import EcommerceStore.Dao.OrderDao;
import EcommerceStore.Entities.Order;
import EcommerceStore.Services.CRUService;
import EcommerceStore.Services.DeleteService;

import java.util.List;
public class OrderService implements CRUService<Order>, DeleteService<Order> {
    OrderDao orderDao = null;
    public OrderService(OrderDao orderDao) {
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
    public void update(Order order) {
        orderDao.update(order);
    }
    @Override
    public void delete(Order order) {
        orderDao.delete(order);
    }
}