package Entities;


import java.sql.Date;

public class Order {

  private long orderId;
  private long customerId;
  private Date orderDate;
  private long totalAmount;

  public Order(long customerId, Date orderDate, long totalAmount) {
    this.customerId = customerId;
    this.orderDate = orderDate;
    this.totalAmount = totalAmount;
  }

  public Order(long orderId, long customerId, Date orderDate, long totalAmount) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.orderDate = orderDate;
    this.totalAmount = totalAmount;
  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public java.sql.Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
  }


  public long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(long totalAmount) {
    this.totalAmount = totalAmount;
  }

}
