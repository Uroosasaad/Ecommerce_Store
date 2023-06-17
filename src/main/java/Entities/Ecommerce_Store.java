package Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("ecommerce_store")
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties("document")
public class Ecommerce_Store {
    @JsonProperty("addresses")
    private Addresses addresses;

    @JsonProperty("categories")
    private Categories categories;

    @JsonProperty("suppliers")
    private Suppliers suppliers;

    @JsonProperty("orders")
    private Orders orders;

    @JsonProperty("customers")
    private Customers customers;

    public Ecommerce_Store() {
    }

    public Ecommerce_Store(Addresses addresses, Categories categories, Suppliers suppliers, Orders orders, Customers customers) {
        this.addresses = addresses;
        this.categories = categories;
        this.suppliers = suppliers;
        this.orders = orders;
        this.customers = customers;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
}


