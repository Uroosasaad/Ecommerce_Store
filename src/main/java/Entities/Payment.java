package Entities;


import java.sql.Timestamp;

public class Payment {

  private long paymentId;
  private long orderId;
  private java.sql.Timestamp paymentDate;
  private long paymentAmount;

  public Payment(long paymentId, long orderId, Timestamp paymentDate, long paymentAmount) {
    this.paymentId = paymentId;
    this.orderId = orderId;
    this.paymentDate = paymentDate;
    this.paymentAmount = paymentAmount;
  }

  public long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(long paymentId) {
    this.paymentId = paymentId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public java.sql.Timestamp getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(java.sql.Timestamp paymentDate) {
    this.paymentDate = paymentDate;
  }


  public long getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(long paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

}
