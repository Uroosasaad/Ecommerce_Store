package Entities;


public class CartItem {

  private long cartItemId;
  private long cartId;
  private long productId;
  private long quantity;

  public CartItem(long cartItemId, long cartId, long productId, long quantity) {
    this.cartItemId = cartItemId;
    this.cartId = cartId;
    this.productId = productId;
    this.quantity = quantity;
  }

  public long getCartItemId() {
    return cartItemId;
  }

  public void setCartItemId(long cartItemId) {
    this.cartItemId = cartItemId;
  }


  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

}
