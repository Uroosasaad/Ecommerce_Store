package Entities;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="supplier")
@XmlAccessorType(XmlAccessType.FIELD)
public class Supplier  extends BaseEntity{
  @XmlAttribute(name = "id")
  private long supplierId;
  @XmlElement(name = "supplier_name")
  private String supplierName;

  public Supplier(long supplierId, String supplierName) {
    this.supplierId = supplierId;
    this.supplierName = supplierName;
  }

  public long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(long supplierId) {
    this.supplierId = supplierId;
  }


  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  public Supplier() {
  }

  @Override
  public String toString() {
    return "Supplier Id: " + this.getSupplierId() + " - Supplier Name: " + this.getSupplierName();
  }
}
