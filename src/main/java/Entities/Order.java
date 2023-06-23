package Entities;

import JacksonService.LocalDateDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.time.LocalDate;
import java.util.Date;

//import java.sql.Date;

@XmlRootElement(name="order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

    @JsonProperty("id")
    private byte id;

    @JsonProperty("customer_id")
    private byte customerId;

    @JsonProperty("order_date")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate orderDate;

    @JsonProperty("total_amount")
    private byte totalAmount;

    public Order(@JsonProperty("id")byte id, @JsonProperty("customer_id")byte customerId, @JsonProperty("order_date")LocalDate orderDate, @JsonProperty("address_id")byte totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    @JsonProperty("id")
    public byte getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(byte id) {
        this.id = id;
    }
    @JsonProperty("customer_id")
    public byte getCustomerId() {
        return customerId;
    }
    @JsonProperty("customer_id")
    public void setCustomerId(byte customerId) {
        this.customerId = customerId;
    }
    @JsonProperty("order_date")
    public LocalDate getOrderDate() {
        return orderDate;
    }
    @JsonProperty("order_date")
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("total_amount")
    public byte getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("total_amount")
    public void setTotalAmount(byte totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order Id: " + this.getId() + " Order Date: " + this.getOrderDate();
    }
}