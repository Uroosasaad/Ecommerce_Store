package ServiceImpl;

import Dao.CustomerDao;
import Entities.Customer;
import Services.DAOService;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.List;

public class CustomerDAOImpl implements DAOService<Customer> {
    CustomerDao customerDao = null;

    public CustomerDAOImpl(CustomerDao customerDao) {
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
    public void update(Customer customer, String[] params) {
        customerDao.update(customer,params);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }
}
