package sizebay.catalog.client.model.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ProductFilter extends Filter {

	private String page;
	private String id;
	private String name;
	private String permalink;
	private String ageGroup;
	private String feedAgeGroup;
	private String gender;
	private String feedGender;
	private String feedProductId;
	private String brandId;
	private String brandName;
	private String feedBrandId;
	private String feedBrandName;
	private String categoryId;
	private String categoryName;
	private String modelingId;
	private String modelingName;
	private String sizeType;
	private String modelingSizeType;
	private String strongBrandId;
	private String strongBrandName;
	private String strongCategoryType;
	private String strongCategoryId;
	private String strongCategoryName;
	private String strongSubcategoryId;
	private String strongSubcategoryName;
	private String strongModelId;
	private String strongModelName;
	private String slugId;
	private String onlyShoes;
	private String productsThatShouldBeFixed;
	private String productsAvailable;
	private String productsUnavailable;
	private String groupIds;
	private String groupAgeGroup;
}
