package sizebay.catalog.client.model.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ModelingFilter extends Filter {

	private String page;
	private String id;
	private String name;
	private String ageGroup;
	private String gender;
	private String sizeType;
	private String brandId;
	private String brandName;
	private String strongTypeId;
	private String strongTypeName;
	private String onlyAccessories;
	private String onlyShoes;
	private String status;

}
