package sizebay.catalog.client.model.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BrandFilter extends Filter {

	private String page;
	private String name;
	private String strongBrandId;
	private String strongBrandName;
	private String onlyShoe;
	private String onlyWithAssociation;
	private String onlyWithoutAssociation;

}
