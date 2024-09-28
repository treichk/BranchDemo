package com.example.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.response.MockRestResponseCreators;
import org.springframework.web.server.ResponseStatusException;

import dto.github.GitHubUser;

@RestClientTest(GitHubService.class)
class GetGitHubUserDataTest {

	@Autowired
	private GitHubService service;
	@Autowired
	private MockRestServiceServer mockRestServiceServer;

	@Test
	void userClientSuccessfullyReturnsUser() {

		String json = """
				{
				  "login": "octocat",
				  "avatar_url": "https://avatars.githubusercontent.com/u/583231?v=4",
				  "gravatar_id": "",
				  "url": "https://api.github.com/users/octocat",
				  "html_url": "https://github.com/octocat",
				  "name": "The Octocat",
				  "location": "San Francisco",
				  "email": null,
				  "created_at": "2011-01-25T18:44:36Z",
				  "updated_at": "2024-09-22T11:25:27Z"
				}
				   """;

		this.mockRestServiceServer
		.expect(requestTo("https://api.github.com/users/octocat"))
		.andRespond(withSuccess(json, MediaType.APPLICATION_JSON));

		GitHubUser result = service.getGitHubUserData("octocat");

		assertNotNull(result);
	}



	@Test
	void userClientThrowsExceptionWhenNoUserIsFound() {
		this.mockRestServiceServer.expect(requestTo("https://api.github.com/users/doesntexist"))
		.andRespond(MockRestResponseCreators.withStatus(HttpStatus.NOT_FOUND));

		assertThrows(ResponseStatusException.class, () -> service.getGitHubUserData("doesntexist"));
	}

}
