package Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName("ecommerce_store")
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties("document")
public class Ecommerce_Store {
    @JsonProperty("address")
    private List<Address> addresses;

    @JsonProperty("categories")
    private List<Category> categories;

    @JsonProperty("suppliers")
    private List<Supplier> suppliers;

    @JsonProperty("orders")
    private List<Order> orders;

    @JsonProperty("customers")
    private List<Customer> customers;

    public Ecommerce_Store() {
    }

    public Ecommerce_Store(List<Address> addresses, List<Category> categories, List<Supplier> suppliers, List<Order> orders, List<Customer> customers) {
        this.addresses = addresses;
        this.categories = categories;
        this.suppliers = suppliers;
        this.orders = orders;
        this.customers = customers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}


