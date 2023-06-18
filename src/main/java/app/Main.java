package app;
import mainEcommerce.Dao.CustomerDao;
import mainEcommerce.Dao.OrderDao;
import EcommerceStore.Entities.Customer;
import EcommerceStore.Entities.Order;
import EcommerceStore.Services.ServiceImpl.CustomerService;
import EcommerceStore.Services.ServiceImpl.OrderService;
import java.sql.Date;
public class Main {
    public static void main(String[] args) {
        Order order= new Order(1,(new Date(2023,6,9)),50);
        OrderService orderDAO = new OrderService(new OrderDao());
        orderDAO.create(order);
        Order savedOrder = orderDAO.getById(100);
        if (savedOrder != null)
            System.out.println(savedOrder.getTotalAmount() + " " + savedOrder.getOrderDate());
        CustomerService customerDAO = new CustomerService(new CustomerDao());
        customerDAO.create(
                (new Customer(1007,"Elon","Musk","Elon@Tesla.com", 1))
        );
        Customer customer = customerDAO.getById(1007);
        if(customer != null)
        System.out.println(customer.getFirstName() + " " + customer.getLastName());
    }
}