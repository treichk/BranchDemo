package dto.github;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"collaborators",
	"name",
	"space",
	"private_repos"
})

@Generated("jsonschema2pojo")
public class Plan {

	@JsonProperty("collaborators")
	private Integer collaborators;

	@JsonProperty("name")
	private String name;

	@JsonProperty("space")
	private Integer space;

	@JsonProperty("private_repos")
	private Integer privateRepos;


	@JsonProperty("collaborators")
	public Integer getCollaborators() {
		return collaborators;
	}

	@JsonProperty("collaborators")
	public void setCollaborators(Integer collaborators) {
		this.collaborators = collaborators;
	}


	@JsonProperty("name")
	public String getName() {
		return name;
	}


	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}


	@JsonProperty("space")
	public Integer getSpace() {
		return space;
	}


	@JsonProperty("space")
	public void setSpace(Integer space) {
		this.space = space;
	}


	@JsonProperty("private_repos")
	public Integer getPrivateRepos() {
		return privateRepos;
	}


	@JsonProperty("private_repos")
	public void setPrivateRepos(Integer privateRepos) {
		this.privateRepos = privateRepos;
	}

}