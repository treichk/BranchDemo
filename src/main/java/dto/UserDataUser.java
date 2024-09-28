package dto;

import java.net.URI;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
	"user_name",
	"display_name",
	"avatar",
	"geo_location",
	"email",
	"url",
	"created_at",
	"repos"
})
@Generated("jsonschema2pojo")
public class UserDataUser {

	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("display_name")
	private String displayName;
	@JsonProperty("avatar")
	private URI avatar;
	@JsonProperty("geo_location")
	private String geoLocation;
	@JsonProperty("email")
	private Object email;
	@JsonProperty("url")
	private URI url;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("repos")
	private List<UserDataRepo> repos;

	public UserDataUser() {
	}

	/**
	 *
	 * @param createdAt
	 * @param geoLocation
	 * @param displayName
	 * @param repos
	 * @param avatar
	 * @param userName
	 * @param email
	 * @param url
	 */
	public UserDataUser(String userName, String displayName, URI avatar, String geoLocation, Object email, URI url, String createdAt, List<UserDataRepo> repos) {
		super();
		this.userName = userName;
		this.displayName = displayName;
		this.avatar = avatar;
		this.geoLocation = geoLocation;
		this.email = email;
		this.url = url;
		this.createdAt = createdAt;
		this.repos = repos;
	}

	@JsonProperty("user_name")
	public String getUserName() {
		return userName;
	}

	@JsonProperty("user_name")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty("display_name")
	public String getDisplayName() {
		return displayName;
	}

	@JsonProperty("display_name")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@JsonProperty("avatar")
	public URI getAvatar() {
		return avatar;
	}

	@JsonProperty("avatar")
	public void setAvatar(URI avatar) {
		this.avatar = avatar;
	}

	@JsonProperty("geo_location")
	public String getGeoLocation() {
		return geoLocation;
	}

	@JsonProperty("geo_location")
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	@JsonProperty("email")
	public Object getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(Object email) {
		this.email = email;
	}

	@JsonProperty("url")
	public URI getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(URI url) {
		this.url = url;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("repos")
	public List<UserDataRepo> getRepos() {
		return repos;
	}

	@JsonProperty("repos")
	public void setRepos(List<UserDataRepo> repos) {
		this.repos = repos;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(UserDataUser.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("userName");
		sb.append('=');
		sb.append(((this.userName == null)?"<null>":this.userName));
		sb.append(',');
		sb.append("displayName");
		sb.append('=');
		sb.append(((this.displayName == null)?"<null>":this.displayName));
		sb.append(',');
		sb.append("avatar");
		sb.append('=');
		sb.append(((this.avatar == null)?"<null>":this.avatar));
		sb.append(',');
		sb.append("geoLocation");
		sb.append('=');
		sb.append(((this.geoLocation == null)?"<null>":this.geoLocation));
		sb.append(',');
		sb.append("email");
		sb.append('=');
		sb.append(((this.email == null)?"<null>":this.email));
		sb.append(',');
		sb.append("url");
		sb.append('=');
		sb.append(((this.url == null)?"<null>":this.url));
		sb.append(',');
		sb.append("createdAt");
		sb.append('=');
		sb.append(((this.createdAt == null)?"<null>":this.createdAt));
		sb.append(',');
		sb.append("repos");
		sb.append('=');
		sb.append(((this.repos == null)?"<null>":this.repos));
		sb.append(',');
		if (sb.charAt((sb.length()- 1)) == ',') {
			sb.setCharAt((sb.length()- 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}
	
}
