package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Supplier  extends BaseEntity {
  @JsonProperty("id")
  private byte id;

  @JsonProperty("supplier_name")
  private String supplierName;

  public Supplier(    @JsonProperty("id")byte id,
                      @JsonProperty("supplier_name")String supplierName) {
    this.id = id;
    this.supplierName = supplierName;
  }

  @JsonProperty("id")
  public byte getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(byte id) {
    this.id = id;
  }

  @JsonProperty("supplier_name")
  public String getSupplierName() {
    return supplierName;
  }

  @JsonProperty("supplier_name")
  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  @Override
  public String toString() {
    return "Supplier Id: " + this.getId() + " - Supplier Name: " + this.getSupplierName();
  }
}
