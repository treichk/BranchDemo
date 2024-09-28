
package dto.github.repo;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "advanced_security",
    "dependabot_security_updates",
    "secret_scanning",
    "secret_scanning_push_protection",
    "secret_scanning_non_provider_patterns"
})
@Generated("jsonschema2pojo")
public class SecurityAndAnalysis {

    @JsonProperty("advanced_security")
    private AdvancedSecurity advancedSecurity;
    /**
     * Enable or disable Dependabot security updates for the repository.
     * 
     */
    @JsonProperty("dependabot_security_updates")
    @JsonPropertyDescription("Enable or disable Dependabot security updates for the repository.")
    private DependabotSecurityUpdates dependabotSecurityUpdates;
    @JsonProperty("secret_scanning")
    private SecretScanning secretScanning;
    @JsonProperty("secret_scanning_push_protection")
    private SecretScanningPushProtection secretScanningPushProtection;
    @JsonProperty("secret_scanning_non_provider_patterns")
    private SecretScanningNonProviderPatterns secretScanningNonProviderPatterns;

    @JsonProperty("advanced_security")
    public AdvancedSecurity getAdvancedSecurity() {
        return advancedSecurity;
    }

    @JsonProperty("advanced_security")
    public void setAdvancedSecurity(AdvancedSecurity advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    /**
     * Enable or disable Dependabot security updates for the repository.
     * 
     */
    @JsonProperty("dependabot_security_updates")
    public DependabotSecurityUpdates getDependabotSecurityUpdates() {
        return dependabotSecurityUpdates;
    }

    /**
     * Enable or disable Dependabot security updates for the repository.
     * 
     */
    @JsonProperty("dependabot_security_updates")
    public void setDependabotSecurityUpdates(DependabotSecurityUpdates dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = dependabotSecurityUpdates;
    }

    @JsonProperty("secret_scanning")
    public SecretScanning getSecretScanning() {
        return secretScanning;
    }

    @JsonProperty("secret_scanning")
    public void setSecretScanning(SecretScanning secretScanning) {
        this.secretScanning = secretScanning;
    }

    @JsonProperty("secret_scanning_push_protection")
    public SecretScanningPushProtection getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    @JsonProperty("secret_scanning_push_protection")
    public void setSecretScanningPushProtection(SecretScanningPushProtection secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    @JsonProperty("secret_scanning_non_provider_patterns")
    public SecretScanningNonProviderPatterns getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    @JsonProperty("secret_scanning_non_provider_patterns")
    public void setSecretScanningNonProviderPatterns(SecretScanningNonProviderPatterns secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

}
