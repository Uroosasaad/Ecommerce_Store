package Entities;


public class Review {

  private long reviewId;
  private long customerId;
  private long productId;
  private long rating;
  private String comment;

  public Review(long reviewId, long customerId, long productId, long rating, String comment) {
    this.reviewId = reviewId;
    this.customerId = customerId;
    this.productId = productId;
    this.rating = rating;
    this.comment = comment;
  }

  public long getReviewId() {
    return reviewId;
  }

  public void setReviewId(long reviewId) {
    this.reviewId = reviewId;
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


  public long getRating() {
    return rating;
  }

  public void setRating(long rating) {
    this.rating = rating;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

}
