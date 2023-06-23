package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

  @JsonProperty("id")
  private byte id;

  @JsonProperty("street")
  private String street;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("zip_code")
  private int zipCode;

  public Address(@JsonProperty("id") byte id,@JsonProperty("street") String street, @JsonProperty("city")String city, @JsonProperty("state")String state, @JsonProperty("zip_code")int zipCode) {
    this.id = id;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }
  @JsonProperty("id")
  public byte getId() {
    return id;
  }
  @JsonProperty("id")
  public void setId(byte id) {
    this.id = id;
  }
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  @JsonProperty("street")
  public void setStreet(String street) {
    this.street = street;
  }
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }
  @JsonProperty("zip_code")
  public int getZipCode() {
    return zipCode;
  }
  @JsonProperty("zip_code")
  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }
    @Override
  public String toString() {
      return "Address Id: " + this.getId() + " - Street Name: " + this.getStreet();

    }
  }

