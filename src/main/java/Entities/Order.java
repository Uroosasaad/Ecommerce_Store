package Entities;

import JacksonService.LocalDateDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.sql.Date;

public class Order  extends BaseEntity {

    @JsonProperty("@id")
    private byte id;

    @JsonProperty("customer_id")
    private byte customerId;

    @JsonProperty("order_date")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date orderDate;

    @JsonProperty("total_amount")
    private byte totalAmount;

    public Order(byte id, byte customerId, Date orderDate, byte totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getCustomerId() {
        return customerId;
    }

    public void setCustomerId(byte customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public byte getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(byte totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order Id: " + this.getId() + "Order Date: " + this.getOrderDate();
    }
}