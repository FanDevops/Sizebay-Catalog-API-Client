package sizebay.catalog.client.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class TenantPlatformStore implements Serializable {

    Long id;
    Long tenantId;
    String storeId;
    String accessToken;
    String passToken;
    EcommercePlatform platform;

}
