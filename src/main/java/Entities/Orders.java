package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Orders {
    @JsonProperty("order")
    private List<Order> orderList;

    public Orders(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
