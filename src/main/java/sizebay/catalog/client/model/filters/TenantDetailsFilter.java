package sizebay.catalog.client.model.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TenantDetailsFilter extends Filter {

    private String page;
    private String status;
    private String responsable;
    private String modelingType;
    private String plan;
    private String coveredCategories;
    private String features;

}
