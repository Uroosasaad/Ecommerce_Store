package Mysql;


import Entities.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            File jsonFile = new File("src\\main\\resources\\ecommerce_store1.json"); // Replace "data.json" with your actual JSON file path

            ObjectMapper mapper = new ObjectMapper();

            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
//            String exampleRequest = FileUtils.readFileToString(new File("src\\main\\resources\\ecommerce_store.json"), StandardCharsets.UTF_8);
            String exampleRequest = new String(Files.readAllBytes(Paths.get("src\\main\\resources\\ecommerce_store.json")));

             Ecommerce_Store ecommerceStore = mapper.readValue(exampleRequest, Ecommerce_Store.class);

            Addresses addresses = ecommerceStore.getAddresses();
            Categories categories = ecommerceStore.getCategories();
            Suppliers suppliers = ecommerceStore.getSuppliers();
            Orders orders = ecommerceStore.getOrders();
            Customers customers = ecommerceStore.getCustomers();

//            System.out.println("Address: ");
//            List<Address> addresses = ecommerceStore.getAddresses().getAddressList();
//            for (Address address : addresses.getAddressList()) {
//                System.out.println("Addresses:");
//             //   System.out.println(addresses.toString());
//            }


    } catch (Exception e) {
        e.printStackTrace();
        }
    }
}