package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Address {

  @JsonProperty("@id")
  private byte id;

  @JsonProperty("street")
  private String street;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("zip_code")
  private int zipCode;

  public Address(byte id, String street, String city, String state, int zipCode) {
    this.id = id;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public byte getId() {
    return id;
  }

  public void setId(byte id) {
    this.id = id;
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

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }
    @Override
  public String toString() {
      return "Address Id: " + this.getId() + " - Street Name: " + this.getStreet();

    }
  }

