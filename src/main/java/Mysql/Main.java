package Mysql;
import Entities.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        try {
            File jsonFile = new File("src\\main\\resources\\ecommerce_store.json"); // Replace "data.json" with your actual JSON file path
            ObjectMapper mapper = new ObjectMapper();
            Ecommerce_Store ecommerceStore = new Ecommerce_Store();
            JsonNode mainParentNode = mapper.readTree(jsonFile);

            if (mainParentNode != null) {
                //Iterating addresses
                JsonNode addressesNode = mainParentNode.findPath("addresses");
                if (addressesNode != null) {
                    JsonNode addressNodeList = addressesNode.findPath("address");
                    if (addressNodeList != null && addressNodeList.size() > 0) {
                        List<Address> addressList = new ArrayList<Address>();
                        for (JsonNode addressNode : addressNodeList) {
                            Address address = mapper.treeToValue(addressNode, Address.class);
                            addressList.add(address);
                            logger.info(address.toString());
                        }
                        ecommerceStore.setAddresses(addressList);
                    }
                }

                JsonNode categoriesNode = mainParentNode.findPath("categories");
                if (categoriesNode != null)
                {
                    JsonNode categoryNodeList = categoriesNode.findValue("category");
                    if (categoryNodeList!=null && categoryNodeList.size() > 0){
                        List<Category> categoryList = new ArrayList<Category>();
                        for (JsonNode categoryNode: categoryNodeList) {
                            Category category = mapper.treeToValue(categoryNode, Category.class);
                            logger.info(category.toString());
                            categoryList.add(category);
                        }
                        ecommerceStore.setCategories(categoryList);
                    }

                }

                JsonNode suppliersNode = mainParentNode.findPath("suppliers");
                if (suppliersNode != null)
                {
                    JsonNode supplierNodeList = suppliersNode.findValue("supplier");
                    if (supplierNodeList != null && supplierNodeList.size() > 0)
                    {
                        List<Supplier> supplierList = new ArrayList<>();
                        for (JsonNode supplierNode: supplierNodeList) {
                            Supplier supplier = mapper.treeToValue(supplierNode, Supplier.class);
                            logger.info(supplier.toString());
                            supplierList.add(supplier);
                        }
                        ecommerceStore.setSuppliers(supplierList);
                    }
                }

                JsonNode ordersNode = mainParentNode.findPath("orders");
                if (ordersNode != null)
                {
                   JsonNode orderNodeList = ordersNode.findValue("order");
                   if (orderNodeList != null && orderNodeList.size() > 0) {
                       List<Order> orderList = new ArrayList<>();
                       for (JsonNode orderNode : orderNodeList) {
                          Order order = mapper.treeToValue(orderNode, Order.class);
                          logger.info(order.toString());
                          orderList.add(order);
                       }
                       ecommerceStore.setOrders(orderList);
                   }

                }

                JsonNode customersNode = mainParentNode.findPath("customers");
                if (customersNode != null)
                {
                    JsonNode customerNodeList = customersNode.findPath("customer");
                    if (customerNodeList != null && customerNodeList.size() > 0)
                    {
                       List<Customer> customerList = new ArrayList<>();
                       for (JsonNode customerNode : customerNodeList) {
                           Customer customer = mapper.treeToValue(customerNode, Customer.class);
                           logger.info(customer.toString());
                           customerList.add(customer);
                       }
                       ecommerceStore.setCustomers(customerList);
                    }
                }


            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}