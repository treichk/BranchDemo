
package dto.github.repo;

import java.util.HashMap;
import java.util.Map;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status"
})
@Generated("jsonschema2pojo")
public class SecretScanningPushProtection {

    @JsonProperty("status")
    private SecretScanningPushProtection.Status status;

    @JsonProperty("status")
    public SecretScanningPushProtection.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(SecretScanningPushProtection.Status status) {
        this.status = status;
    }

    @Generated("jsonschema2pojo")
    public enum Status {

        ENABLED("enabled"),
        DISABLED("disabled");
        private final String value;
        private final static Map<String, SecretScanningPushProtection.Status> CONSTANTS = new HashMap<String, SecretScanningPushProtection.Status>();

        static {
            for (SecretScanningPushProtection.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static SecretScanningPushProtection.Status fromValue(String value) {
            SecretScanningPushProtection.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
