package Mysql;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLSchemaValidator {
    public static boolean validateXML (String xmlFilePath,String xsdFilePath) {
        boolean isValid = validateXMLSchema(xmlFilePath, xsdFilePath);
        if (isValid) {
            System.out.println("XML file is valid against the XSD schema.");
            return true;
        } else {
            System.out.println("XML file is not valid against the XSD schema.");
        }
        return false;
    }
    public static boolean validateXMLSchema(String xmlFilePath, String xsdFilePath) {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File(xsdFilePath));
            Validator validator = schema.newValidator();
            Source source = new StreamSource(new File(xmlFilePath));
            validator.validate(source);
            return true;
        } catch (IOException | SAXException e) {
            e.printStackTrace();
            return false;
        }
    }
}