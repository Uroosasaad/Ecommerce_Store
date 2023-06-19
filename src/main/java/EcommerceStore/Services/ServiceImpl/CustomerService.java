package EcommerceStore.Services.ServiceImpl;
import EcommerceStore.Dao.CustomerDao;
import EcommerceStore.Entities.Customer;
import EcommerceStore.Services.CRUService;

import java.util.List;
public class CustomerService implements CRUService<Customer> {
    CustomerDao customerDao = null;
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    @Override
    public Customer getById(int id) {
        return customerDao.getById(id);
    }
    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }
    @Override
    public void create(Customer customer) {
        customerDao.create(customer);
    }
    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }
}