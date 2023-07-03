package Entities;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer  extends BaseEntity {
  @XmlAttribute(name = "id")
  public long customerId;
  @XmlElement(name = "first_name")
  public String firstName;
  @XmlElement(name = "last_name")
  public String lastName;
  @XmlElement(name = "email")
  public String email;
  @XmlElement(name = "address_id")
  public long addressId;

  public Customer( ) {

  }

  public Customer(long customerId, String firstName, String lastName, String email, long addressId) {
    this.customerId = customerId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.addressId = addressId;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  @Override
  public String toString() {
    return "Customer Id: " + this.getCustomerId() + " - First Name: " + this.getFirstName();
  }
}
