package Mysql;

public class Main {
    public static void main(String[] args) {

        String xmlFilePath = "src\\main\\xmlFile\\Customers.xml";
        String xsdFilePath = "src\\main\\xmlFile\\Customer.xsd";
        DOMParser domParser = new DOMParser();
        if(XMLSchemaValidator.validateXML(xmlFilePath,xsdFilePath)) {

            domParser.customersDomParser(xmlFilePath);
        }

        String xmlFilePath1 = "src\\main\\xmlFile\\Suppliers.xml";
        String xsdFilePath1 = "src\\main\\xmlFile\\Suppliers.xsd";
       // DOMParser domParser1 = new DOMParser();
        if (XMLSchemaValidator.validateXML(xmlFilePath1,xsdFilePath1)) {

            domParser.suppliersDOMParser(xmlFilePath1);
        }

//        Order order= new Order(1,(new Date(2023,6,9)),50);
//
//        //Service layer uses dao pattern to create order
//        //                        service layer    dao pattern
//        OrderDAOImpl orderDAOService = new OrderDAOImpl(new OrderDao());
//        orderDAOService.create(order);
//
//        // retrieving order from database through service classes using getbyid method.
//        Order savedOrder = orderDAOService.getById(1002);
//        if (savedOrder != null)
//            System.out.println(savedOrder.getTotalAmount() + " " + savedOrder.getOrderDate());
//
//        CustomerDAOImpl customerDAOService = new CustomerDAOImpl(new CustomerDao());
//        customerDAOService.create(
//                (new Customer(1004,"Elon","Musk","Elon@Tesla.com", 1))
//        );
//
//        Customer customer = customerDAOService.getById(1004);
//        System.out.println(customer.getFirstName() + " " + customer.getLastName());




    }
}