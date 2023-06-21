package Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Category")
@XmlAccessorType(XmlAccessType.FIELD)
public class Category  extends BaseEntity{

    @JsonProperty("id")
    private byte id;

    @JsonProperty("category_name")
    private String categoryName;

  public Category(@JsonProperty("id")byte id,    @JsonProperty("category_name")
  String categoryName) {
    this.id = id;
    this.categoryName = categoryName;
  }

  @JsonProperty("id")
  public byte getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(byte id) {
    this.id = id;
  }
  @JsonProperty("category_name")
  public String getCategoryName() {
    return categoryName;
  }
  @JsonProperty("category_name")
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String toString() {
    return "Category Id: " + this.getId() + " - Category Name: " + this.getCategoryName();
  }
}
