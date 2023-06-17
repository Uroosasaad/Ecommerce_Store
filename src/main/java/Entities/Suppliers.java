package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Suppliers {

    @JsonProperty("supplier")
    private List<Supplier> supplierList;

    public Suppliers(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
}
