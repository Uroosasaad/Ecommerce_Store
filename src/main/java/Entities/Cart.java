package Entities;
import java.sql.Date;
import java.sql.Timestamp;
public class Cart {
  private long cartId;
  private long customerId;
  private Date createdDate;
  public Cart(long cartId, long customerId, Date createdDate) {
    this.cartId = cartId;
    this.customerId = customerId;
    this.createdDate = createdDate;
  }
  public long getCartId() {
    return cartId;
  }
  public void setCartId(long cartId) {
    this.cartId = cartId;
  }
  public long getCustomerId() {
    return customerId;
  }
  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
}