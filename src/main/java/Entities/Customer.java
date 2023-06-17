package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer  extends BaseEntity {
  @JsonProperty("@id")
  private byte id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("address_id")
  private byte addressId;

  public Customer(byte id, String firstName, String lastName, String email, byte addressId) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.addressId = addressId;
  }

  public byte getId() {
    return id;
  }

  public void setId(byte id) {
    this.id = id;
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

  public byte getAddressId() {
    return addressId;
  }

  public void setAddressId(byte addressId) {
    this.addressId = addressId;
  }

  @Override
  public String toString() {
    return "Customer Id: " + this.getId() + " - First Name: " + this.getFirstName();
  }
}
