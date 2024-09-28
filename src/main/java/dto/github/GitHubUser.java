package dto.github;

import java.net.URI;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"login",
	"id",
	"node_id",
	"avatar_url",
	"gravatar_id",
	"url",
	"html_url",
	"followers_url",
	"following_url",
	"gists_url",
	"starred_url",
	"subscriptions_url",
	"organizations_url",
	"repos_url",
	"events_url",
	"received_events_url",
	"type",
	"site_admin",
	"name",
	"company",
	"blog",
	"location",
	"email",
	"notification_email",
	"hireable",
	"bio",
	"twitter_username",
	"public_repos",
	"public_gists",
	"followers",
	"following",
	"created_at",
	"updated_at",
	"plan",
	"suspended_at",
	"private_gists",
	"total_private_repos",
	"owned_private_repos",
	"disk_usage",
	"collaborators"
})

@Generated("jsonschema2pojo")
public class GitHubUser {

	@JsonProperty("login")
	private String login;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("node_id")
	private String nodeId;
	@JsonProperty("avatar_url")
	private URI avatarUrl;
	@JsonProperty("gravatar_id")
	private String gravatarId;
	@JsonProperty("url")
	private URI url;
	@JsonProperty("html_url")
	private URI htmlUrl;
	@JsonProperty("followers_url")
	private URI followersUrl;
	@JsonProperty("following_url")
	private String followingUrl;
	@JsonProperty("gists_url")
	private String gistsUrl;
	@JsonProperty("starred_url")
	private String starredUrl;
	@JsonProperty("subscriptions_url")
	private URI subscriptionsUrl;
	@JsonProperty("organizations_url")
	private URI organizationsUrl;
	@JsonProperty("repos_url")
	private URI reposUrl;
	@JsonProperty("events_url")
	private String eventsUrl;
	@JsonProperty("received_events_url")
	private URI receivedEventsUrl;
	@JsonProperty("type")
	private String type;
	@JsonProperty("site_admin")
	private Boolean siteAdmin;
	@JsonProperty("name")
	private String name;
	@JsonProperty("company")
	private String company;
	@JsonProperty("blog")
	private String blog;
	@JsonProperty("location")
	private String location;
	@JsonProperty("email")
	private String email;
	@JsonProperty("notification_email")
	private String notificationEmail;
	@JsonProperty("hireable")
	private Boolean hireable;
	@JsonProperty("bio")
	private String bio;
	@JsonProperty("twitter_username")
	private String twitterUsername;
	@JsonProperty("public_repos")
	private Integer publicRepos;
	@JsonProperty("public_gists")
	private Integer publicGists;
	@JsonProperty("followers")
	private Integer followers;
	@JsonProperty("following")
	private Integer following;
	@JsonProperty("created_at")
	private LocalDateTime createdAt;
	@JsonProperty("updated_at")
	private LocalDateTime updatedAt;
	@JsonProperty("plan")
	private Plan plan;
	@JsonProperty("suspended_at")
	private LocalDateTime suspendedAt;
	@JsonProperty("private_gists")
	private Integer privateGists;
	@JsonProperty("total_private_repos")
	private Integer totalPrivateRepos;
	@JsonProperty("owned_private_repos")
	private Integer ownedPrivateRepos;
	@JsonProperty("disk_usage")
	private Integer diskUsage;
	@JsonProperty("collaborators")
	private Integer collaborators;

	@JsonProperty("login")
	public String getLogin() {
		return login;
	}

	@JsonProperty("login")
	public void setLogin(String login) {
		this.login = login;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("node_id")
	public String getNodeId() {
		return nodeId;
	}

	@JsonProperty("node_id")
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	@JsonProperty("avatar_url")
	public URI getAvatarUrl() {
		return avatarUrl;
	}

	@JsonProperty("avatar_url")
	public void setAvatarUrl(URI avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	@JsonProperty("gravatar_id")
	public String getGravatarId() {
		return gravatarId;
	}

	@JsonProperty("gravatar_id")
	public void setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
	}

	@JsonProperty("url")
	public URI getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(URI url) {
		this.url = url;
	}

	@JsonProperty("html_url")
	public URI getHtmlUrl() {
		return htmlUrl;
	}

	@JsonProperty("html_url")
	public void setHtmlUrl(URI htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	@JsonProperty("followers_url")
	public URI getFollowersUrl() {
		return followersUrl;
	}

	@JsonProperty("followers_url")
	public void setFollowersUrl(URI followersUrl) {
		this.followersUrl = followersUrl;
	}

	@JsonProperty("following_url")
	public String getFollowingUrl() {
		return followingUrl;
	}

	@JsonProperty("following_url")
	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}

	@JsonProperty("gists_url")
	public String getGistsUrl() {
		return gistsUrl;
	}

	@JsonProperty("gists_url")
	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}

	@JsonProperty("starred_url")
	public String getStarredUrl() {
		return starredUrl;
	}

	@JsonProperty("starred_url")
	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}

	@JsonProperty("subscriptions_url")
	public URI getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	@JsonProperty("subscriptions_url")
	public void setSubscriptionsUrl(URI subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}

	@JsonProperty("organizations_url")
	public URI getOrganizationsUrl() {
		return organizationsUrl;
	}

	@JsonProperty("organizations_url")
	public void setOrganizationsUrl(URI organizationsUrl) {
		this.organizationsUrl = organizationsUrl;
	}

	@JsonProperty("repos_url")
	public URI getReposUrl() {
		return reposUrl;
	}

	@JsonProperty("repos_url")
	public void setReposUrl(URI reposUrl) {
		this.reposUrl = reposUrl;
	}

	@JsonProperty("events_url")
	public String getEventsUrl() {
		return eventsUrl;
	}

	@JsonProperty("events_url")
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	@JsonProperty("received_events_url")
	public URI getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	@JsonProperty("received_events_url")
	public void setReceivedEventsUrl(URI receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("site_admin")
	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	@JsonProperty("site_admin")
	public void setSiteAdmin(Boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("company")
	public String getCompany() {
		return company;
	}

	@JsonProperty("company")
	public void setCompany(String company) {
		this.company = company;
	}

	@JsonProperty("blog")
	public String getBlog() {
		return blog;
	}

	@JsonProperty("blog")
	public void setBlog(String blog) {
		this.blog = blog;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("notification_email")
	public String getNotificationEmail() {
		return notificationEmail;
	}

	@JsonProperty("notification_email")
	public void setNotificationEmail(String notificationEmail) {
		this.notificationEmail = notificationEmail;
	}

	@JsonProperty("hireable")
	public Boolean getHireable() {
		return hireable;
	}

	@JsonProperty("hireable")
	public void setHireable(Boolean hireable) {
		this.hireable = hireable;
	}

	@JsonProperty("bio")
	public String getBio() {
		return bio;
	}

	@JsonProperty("bio")
	public void setBio(String bio) {
		this.bio = bio;
	}

	@JsonProperty("twitter_username")
	public String getTwitterUsername() {
		return twitterUsername;
	}

	@JsonProperty("twitter_username")
	public void setTwitterUsername(String twitterUsername) {
		this.twitterUsername = twitterUsername;
	}

	@JsonProperty("public_repos")
	public Integer getPublicRepos() {
		return publicRepos;
	}

	@JsonProperty("public_repos")
	public void setPublicRepos(Integer publicRepos) {
		this.publicRepos = publicRepos;
	}

	@JsonProperty("public_gists")
	public Integer getPublicGists() {
		return publicGists;
	}

	@JsonProperty("public_gists")
	public void setPublicGists(Integer publicGists) {
		this.publicGists = publicGists;
	}

	@JsonProperty("followers")
	public Integer getFollowers() {
		return followers;
	}

	@JsonProperty("followers")
	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	@JsonProperty("following")
	public Integer getFollowing() {
		return following;
	}

	@JsonProperty("following")
	public void setFollowing(Integer following) {
		this.following = following;
	}

	@JsonProperty("created_at")
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updated_at")
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("plan")
	public Plan getPlan() {
		return plan;
	}

	@JsonProperty("plan")
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@JsonProperty("suspended_at")
	public LocalDateTime getSuspendedAt() {
		return suspendedAt;
	}

	@JsonProperty("suspended_at")
	public void setSuspendedAt(LocalDateTime suspendedAt) {
		this.suspendedAt = suspendedAt;
	}

	@JsonProperty("private_gists")
	public Integer getPrivateGists() {
		return privateGists;
	}

	@JsonProperty("private_gists")
	public void setPrivateGists(Integer privateGists) {
		this.privateGists = privateGists;
	}

	@JsonProperty("total_private_repos")
	public Integer getTotalPrivateRepos() {
		return totalPrivateRepos;
	}

	@JsonProperty("total_private_repos")
	public void setTotalPrivateRepos(Integer totalPrivateRepos) {
		this.totalPrivateRepos = totalPrivateRepos;
	}

	@JsonProperty("owned_private_repos")
	public Integer getOwnedPrivateRepos() {
		return ownedPrivateRepos;
	}

	@JsonProperty("owned_private_repos")
	public void setOwnedPrivateRepos(Integer ownedPrivateRepos) {
		this.ownedPrivateRepos = ownedPrivateRepos;
	}

	@JsonProperty("disk_usage")
	public Integer getDiskUsage() {
		return diskUsage;
	}

	@JsonProperty("disk_usage")
	public void setDiskUsage(Integer diskUsage) {
		this.diskUsage = diskUsage;
	}

	@JsonProperty("collaborators")
	public Integer getCollaborators() {
		return collaborators;
	}

	@JsonProperty("collaborators")
	public void setCollaborators(Integer collaborators) {
		this.collaborators = collaborators;
	}

}