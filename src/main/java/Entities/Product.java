package Entities;
public class Product {
  private long productId;
  private String productName;
  private long price;
  private long categoryId;
  public Product(long productId, String productName, long price, long categoryId) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.categoryId = categoryId;
  }
  public long getProductId() {
    return productId;
  }
  public void setProductId(long productId) {
    this.productId = productId;
  }
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public long getPrice() {
    return price;
  }
  public void setPrice(long price) {
    this.price = price;
  }
  public long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }
}