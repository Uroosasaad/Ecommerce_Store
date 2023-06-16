package Entities;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="category")
@XmlAccessorType(XmlAccessType.FIELD)
public class Category  extends BaseEntity{

  @XmlAttribute(name = "id")
  private long categoryId;
  @XmlElement(name = "category_name")
  private String categoryName;

  public Category() {
  }

  public Category(long categoryId, String categoryName) {
    this.categoryId = categoryId;
    this.categoryName = categoryName;
  }

  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  @Override
  public String toString() {
    return "Category Id: " + this.getCategoryId() + " - Category Name: " + this.getCategoryName();
  }
}
