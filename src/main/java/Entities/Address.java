package Entities;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address extends BaseEntity {

  @XmlAttribute (name = "id")
  private long addressId;
  @XmlElement(name = "street")
  private String street;
  @XmlElement(name = "city")
  private String city;
  @XmlElement(name = "state")
  private String state;
  @XmlElement(name = "zip_code")
  private long zipCode;

  public Address() {
  }

  public Address(long addressId, String street, String city, String state, long zipCode) {
    this.addressId = addressId;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public long getZipCode() {
    return zipCode;
  }

  public void setZipCode(long zipCode) {
    this.zipCode = zipCode;
  }
  @Override
  public String toString() {
      return "Address Id: " + this.getAddressId() + " - Street Name: " + this.getStreet();

    }
  }

