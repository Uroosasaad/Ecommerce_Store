package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Supplier  extends BaseEntity {
  @JsonProperty("@id")
  private byte id;

  @JsonProperty("supplier_name")
  private String supplierName;

  public Supplier(byte id, String supplierName) {
    this.id = id;
    this.supplierName = supplierName;
  }

  public byte getId() {
    return id;
  }

  public void setId(byte id) {
    this.id = id;
  }

  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  @Override
  public String toString() {
    return "Supplier Id: " + this.getId() + " - Supplier Name: " + this.getSupplierName();
  }
}
