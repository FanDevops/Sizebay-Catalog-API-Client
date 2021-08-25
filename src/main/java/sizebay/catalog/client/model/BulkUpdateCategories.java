package sizebay.catalog.client.model;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class BulkUpdateCategories {

	private List<String> ids;
	private ClothesType clothesType;
	private Long strongCategoryId;
	private Long strongSubcategoryId;
	private Boolean sizeTailor;

}
