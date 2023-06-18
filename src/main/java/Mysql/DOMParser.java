package Mysql;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParser {
    public void customersDomParser(String XMLFilePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File xmlFile = new File(XMLFilePath);
            Document document = builder.parse(xmlFile);
            Element rootElement = document.getDocumentElement();
            NodeList customerNodes = rootElement.getElementsByTagName("Customer");
            for (int i = 0; i < customerNodes.getLength(); i++) {
                Node customerNode = customerNodes.item(i);
                if (customerNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element customerElement = (Element) customerNode;
                    Element firstNameElement = (Element) customerElement.getElementsByTagName("first_name").item(0);
                    String firstName = firstNameElement.getTextContent();
                    Element lastNameElement = (Element) customerElement.getElementsByTagName("last_name").item(0);
                    String lastName = lastNameElement.getTextContent();
                    Element emailElement = (Element) customerElement.getElementsByTagName("email").item(0);
                    String email = emailElement.getTextContent();
                    System.out.println("customer:");
                    System.out.println("first_name: " + firstName);
                    System.out.println("last_name: " + lastName);
                    System.out.println("email: " + email);
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AddressDOMParser (String XMLFilePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File xmlFile = new File(XMLFilePath);
            Document document = builder.parse(xmlFile);
            Element rootElement = document.getDocumentElement();
            NodeList addressNodes = rootElement.getElementsByTagName("Address");
            for (int i = 0; i < addressNodes.getLength(); i++) {
                Node addressNode = addressNodes.item(i);
                if (addressNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element addressElement = (Element) addressNode;
                    Element streetElement = (Element) addressElement.getElementsByTagName("street").item(0);
                    String street = streetElement.getTextContent();
                    Element cityElement = (Element) addressElement.getElementsByTagName("city").item(0);
                    String city = cityElement.getTextContent();
                    Element stateElement = (Element) addressElement.getElementsByTagName("state").item(0);
                    String state = stateElement.getTextContent();
                    Element zipCodeElement = (Element) addressElement.getElementsByTagName("zip_code").item(0);
                    Long zipCode = Long.parseLong(zipCodeElement.getTextContent());
                    System.out.println("Address: ");
                    System.out.println("street: " + street);
                    System.out.println("city: " + city);
                    System.out.println("state: " + state);
                    System.out.println("zip_code: " + zipCode);
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void OrdersDOMParser (String XMLFilePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File xmlFile = new File(XMLFilePath);
            Document document = builder.parse(xmlFile);
            Element rootElement = document.getDocumentElement();
            NodeList orderNodes = rootElement.getElementsByTagName("Order");
            for (int i = 0; i < orderNodes.getLength(); i++) {
                Node orderNode = orderNodes.item(i);
                if (orderNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element orderElement = (Element) orderNodes;
                    Element customerIdElement = (Element) orderElement.getElementsByTagName("customer_id").item(0);
                    String customerId = customerIdElement.getTextContent();
                    Element orderDateElement = (Element) orderElement.getElementsByTagName("order_date").item(0);
                    Long orderDate = Long.parseLong( orderDateElement.getTextContent());
                    Element totalAmountElement = (Element) orderElement.getElementsByTagName("total_amount").item(0);
                    String totalAmount = totalAmountElement.getTextContent();
                    System.out.println("Order: ");
                    System.out.println("customer_id" + customerId);
                    System.out.println("order_date: " + orderDate);
                    System.out.println("total_amount: " + totalAmount);
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void suppliersDOMParser (String XMLFilePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File xmlFile = new File(XMLFilePath);
            Document document = builder.parse(xmlFile);
            Element rootElement = document.getDocumentElement();
            NodeList supplierNodes = rootElement.getElementsByTagName("Supplier");
            for (int i = 0; i < supplierNodes.getLength(); i++) {
                Node supplierNode = supplierNodes.item(i);
                if (supplierNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element supplierElement = (Element) supplierNode;
                    Element supplierNameElement = (Element) supplierElement.getElementsByTagName("supplier_name").item(0);
                    String supplierName = supplierElement.getTextContent();
                    System.out.println("Supplier: ");
                    System.out.println("supplier_name" + supplierName);
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void CategoriesDOMParser (String XMLFilePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File xmlFile = new File(XMLFilePath);
            Document document = builder.parse(xmlFile);
            Element rootElement = document.getDocumentElement();
            NodeList categoryNodes = rootElement.getElementsByTagName("Category");
            for (int i = 0; i < categoryNodes.getLength(); i++) {
                Node categoryNode = categoryNodes.item(i);

                if (categoryNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element categoryElement = (Element) categoryNodes;
                    Element categoryNameElement = (Element) categoryElement.getElementsByTagName("category_name").item(0);
                    String categoryName = categoryNameElement.getTextContent();
                    System.out.println("Category: ");
                    System.out.println("category_name" + categoryName);
                    System.out.println();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}