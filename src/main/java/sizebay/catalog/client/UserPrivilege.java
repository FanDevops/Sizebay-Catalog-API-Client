package sizebay.catalog.client;

public enum UserPrivilege {

    USER("USER"),
    ADMIN("ADMIN"),
    CUSTOMER_SUCCESS("CUSTOMER_SUCCESS"),
    INTEGRATION_API("INTEGRATION_API");

    public final String value;

    private UserPrivilege(final String value) {
        this.value = value;
    }
}
