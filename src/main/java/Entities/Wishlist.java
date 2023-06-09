package Entities;


public class Wishlist {

  private long wishlistId;
  private long customerId;
  private long productId;

  public Wishlist(long wishlistId, long customerId, long productId) {
    this.wishlistId = wishlistId;
    this.customerId = customerId;
    this.productId = productId;
  }

  public long getWishlistId() {
    return wishlistId;
  }

  public void setWishlistId(long wishlistId) {
    this.wishlistId = wishlistId;
  }


  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

}
