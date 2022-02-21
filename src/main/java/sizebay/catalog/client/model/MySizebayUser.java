package sizebay.catalog.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.*;
import lombok.experimental.Accessors;
import sizebay.catalog.client.UserPrivilege;

@Getter
@Setter
@NoArgsConstructor
public class MySizebayUser {

	private Long id;
	private String nickname;
	private String username;
	private String password;
	private Boolean isToSendNews;
	private UserPrivilege privilege;
	private List<Tenant> tenants = new ArrayList<>();

}
