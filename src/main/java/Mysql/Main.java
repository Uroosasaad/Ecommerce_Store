package Mysql;

public class Main {
    public static void main(String[] args) {
        String xmlFilePath = "src\\main\\xmlFile\\Ecommerce.xml";
        String xsdFilePath = "src\\main\\xmlFile\\Ecommerce.xsd";
        JAXBMarshaller domParser = new JAXBMarshaller();
        if(XMLSchemaValidator.validateXML(xmlFilePath,xsdFilePath)) {
            System.out.println("==>XML has been validated through XSD Schema");
            domParser.xmlParser(xmlFilePath);
        }
    }
}