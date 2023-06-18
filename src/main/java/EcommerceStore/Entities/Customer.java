package EcommerceStore.Entities;
public class Customer {
  private long customerId;
  private String firstName;
  private String lastName;
  private String email;
  private long addressId;
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
}