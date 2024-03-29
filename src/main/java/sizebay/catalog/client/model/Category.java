package sizebay.catalog.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-03T14:09:54.342Z")
public class Category   {
  
  private Long id = null;
  private String name = null;
	private StrongCategoryType strongCategoryType = null;
	private Long strongCategoryId = null;
  private String strongCategoryName = null;
	private Long strongSubcategoryId = null;
	private String strongSubcategoryName = null;
	private boolean isShoeCategory;
	private boolean sizeTailor;

  @Getter
  private ClothesType clothesType = ClothesType.FULL_BODY;

  /**
   * Unique identifier representing a specific category. (Read only)
   **/

  @ApiModelProperty(value = "Unique identifier representing a specific category. (Read only)")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Category name.
   **/
  
  @ApiModelProperty(value = "Category name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

	@JsonProperty("isShoeCategory")
	public boolean getIsShoeCategory() {
		return this.getStrongCategoryType() != null && this.getStrongCategoryType().equals(StrongCategoryType.shoe);
	}

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;

    return true && Objects.equals(id, category.id) &&
        Objects.equals(name, category.name)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, clothesType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clothesType: ").append(toIndentedString(clothesType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

