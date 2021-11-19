package sizebay.catalog.client.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BulkUpdateBrandAssociation {

    private List<Long> ids;
    private Long associatedBrandId;
    private Long strongBrandId;

}
