package Entities;


public class Address {

  private long addressId;
  private String street;
  private String city;
  private String state;
  private long zipCode;

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

}
