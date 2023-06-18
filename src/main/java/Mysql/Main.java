package Mysql;

public class Main {
    public static void main(String[] args) {
        String xmlFilePath = "src\\main\\xmlFile\\Customers.xml";
        String xsdFilePath = "src\\main\\xmlFile\\Customer.xsd";
        DOMParser domParser = new DOMParser();
        if (XMLSchemaValidator.validateXML(xmlFilePath, xsdFilePath)) {
            domParser.customersDomParser(xmlFilePath);
        }

        String xmlFilePath1 = "src\\main\\xmlFile\\Suppliers.xml";
        String xsdFilePath1 = "src\\main\\xmlFile\\Suppliers.xsd";
        if (XMLSchemaValidator.validateXML(xmlFilePath1, xsdFilePath1)) {
            domParser.suppliersDOMParser(xmlFilePath1);
        }
    }
}