package shared.domain.model.valueobjects;

import java.util.UUID;
import java.util.Objects;

/**
 * Represents a unique identifier for a customer.
 * This value object encapsulates a UUID and provides
 * methods for creation and validation.
 * @author Open Source Aplication Develoment
 */
public record CustomerId(UUID value) {
    public CustomerId {
        Objects.requireNonNull(value, "CustomerId cannot be null");
    }
/**
     * Creates a new CustomerId with a randomly generated UUID.
     * @return a new instance of CustomerId
     */

    public static CustomerId fromString(String id) {
        return new CustomerId(UUID.fromString(id));
    }
    /**
     * Creates a new CustomerId with a randomly generated UUID.
     * @return a new instance of CustomerId
     */

    @Override
    public String toString() {
        return value.toString();
    }
}
