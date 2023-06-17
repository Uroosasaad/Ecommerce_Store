package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Category  extends BaseEntity{
    @JsonProperty("@id")
    private byte id;

    @JsonProperty("category_name")
    private String categoryName;

  public Category(byte id, String categoryName) {
    this.id = id;
    this.categoryName = categoryName;
  }

  public byte getId() {
    return id;
  }

  public void setId(byte id) {
    this.id = id;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String toString() {
    return "Category Id: " + this.getId() + " - Category Name: " + this.getCategoryName();
  }
}
