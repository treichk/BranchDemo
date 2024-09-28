package dto;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"name",
	"url"
})
@Generated("jsonschema2pojo")
public class UserDataRepo {

	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	private URI url;
	
	public UserDataRepo() {
	}
	
	public UserDataRepo(String name, URI url) {
		this.name = name;
		this.url = url;
	}
	
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("url")
	public URI getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(URI url) {
		this.url = url;
	}

}