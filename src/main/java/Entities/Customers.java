package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Customers {
    @JsonProperty("customer")
    private List<Customer> customerList;

    public Customers(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
