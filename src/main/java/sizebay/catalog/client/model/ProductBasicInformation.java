package sizebay.catalog.client.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.*;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ProductBasicInformation implements Serializable {

	long id;
	@NonNull String name;
	@NonNull String permalink;
	String genderTheWearWasDesignedFor;
	String feedGender;
	String feedProductId;
	String coverImage;
	Boolean isShoe;
	@Deprecated int szbMainCategoryId; // FIXME Remove this field after legacy virtual dead
	@Deprecated int szbSubCategoryId; // FIXME Remove this field after legacy virtual dead
	@Deprecated String szbMainCategoryName = null; // FIXME Remove this field after legacy virtual dead
	@Deprecated String szbSubCategoryName = null; // FIXME Remove this field after legacy virtual dead
	Long feedBrandId;
	String feedBrandName;
	String categoryName;
	String modelingName;
	String observation;
	Measure composedMeasure;
	SizeSystem modelingSizeSystem;
	@Deprecated boolean bottomOnly;
	ClothesType clothesType;
	String sizeType;
	Boolean status;
	Product.AgeGroupEnum ageGroup = null;
	Product.AgeGroupEnum feedAgeGroup = Product.AgeGroupEnum.ADULT;
	Map<String, ModelingSizeMeasures> measures;
	List<CustomRange> customRanges = new ArrayList<>();
	Boolean accessory;
	String tenantName;
	Long tenantId;
	Long strongBrandId;
	String strongBrandName;
	StrongCategoryType strongCategoryType;
	Long strongCategoryId;
	String strongCategoryName;
	Long strongSubcategoryId;
	String strongSubcategoryName;
	Long strongModelId;
	String strongModelName;
	Boolean useStrongModeling;
	double weightStyle;
	SizeSystem sizeSystem;
	boolean sizeTailor;

}