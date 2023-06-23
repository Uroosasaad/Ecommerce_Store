package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer  extends BaseEntity {
  @JsonProperty("id")
  private byte id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("address_id")
  private byte addressId;

  public Customer(@JsonProperty("id")byte id, @JsonProperty("first_name")String firstName, @JsonProperty("last_name")String lastName, @JsonProperty("email")String email, @JsonProperty("address_id")byte addressId) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.addressId = addressId;
  }

  @JsonProperty("id")
  public byte getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(byte id) {
    this.id = id;
  }
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty("first_name")
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("last_name")
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  @JsonProperty("address_id")
  public byte getAddressId() {
    return addressId;
  }

  @JsonProperty("address_id")
  public void setAddressId(byte addressId) {
    this.addressId = addressId;
  }

  @Override
  public String toString() {
    return "Customer Id: " + this.getId() + " - First Name: " + this.getFirstName();
  }
}
