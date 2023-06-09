package Dao;

import Entities.Category;
import Entities.Customer;
import Entities.Order;
import ServiceImpl.CustomerDAOImpl;
import ServiceImpl.OrderDAOImpl;

import java.sql.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Order order= new Order(1,(new Date(2023,6,9)),50);

        OrderDAOImpl orderDAO = new OrderDAOImpl(new OrderDao());
        orderDAO.create(order);

        Order savedOrder = orderDAO.getById(1002);
        if (savedOrder != null)
            System.out.println(savedOrder.getTotalAmount() + " " + savedOrder.getOrderDate());

        CustomerDAOImpl customerDAO = new CustomerDAOImpl(new CustomerDao());
        customerDAO.create(
                (new Customer(1003,"Elon","Musk","Elon@Tesla.com", 1))
        );

        Customer customer = customerDAO.getById(1003);
        System.out.println(customer.getFirstName() + " " + customer.getLastName());




    }
}