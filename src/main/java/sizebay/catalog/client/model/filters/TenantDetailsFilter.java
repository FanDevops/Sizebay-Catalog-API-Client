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
    private String tenantId;
    private String tenantProfile;
    private String tenantSegment;
    private String tenantOperation;
    private String vfrVersion;
    private String responsibleId;
    private String sizeSystem;
    private String typeModeling;
    private String ecommercePlatform;
    private String plan;
    private String reviewStatus;
    private String coveredCategories;
    private String features;
    private Boolean showInImplantation;

}
