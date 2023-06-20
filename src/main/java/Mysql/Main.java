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
                JsonNode categoryNode = mainParentNode.findPath("addresses");
                if (categoryNode != null) {
                    List<Address> addressList = new ArrayList<Address>();
                    JsonNode addressNodeList = categoryNode.findPath("address");
                    if (addressNodeList != null && addressNodeList.size() > 0) {
                        for (JsonNode addressNode : addressNodeList) {
                            Address address = mapper.treeToValue(addressNode, Address.class);
                            addressList.add(address);
                            logger.info(address.toString());
                        }
                        ecommerceStore.setAddresses( addressList);
                    }
                }
            }

            System.out.println(ecommerceStore.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}