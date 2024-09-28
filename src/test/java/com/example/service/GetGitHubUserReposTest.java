package com.example.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

import dto.github.repo.GitHubRepo;

@RestClientTest(GitHubService.class)
class GetGitHubUserReposTest {

	@Autowired
	private GitHubService service;
	@Autowired
	private MockRestServiceServer mockRestServiceServer;

	@Test
	void serviceSuccessfullyReturnsRepos() {

		String json = """
			[
				{
					"name": "boysenberry-repo-1",
					"html_url": "https://github.com/octocat/boysenberry-repo-1"
				},
				{
					"name": "git-consortium",
					"html_url": "https://github.com/octocat/git-consortium"
				}
			]
				   """;

		this.mockRestServiceServer
		.expect(requestTo("https://api.github.com/users/octocat/repos"))
		.andRespond(withSuccess(json, MediaType.APPLICATION_JSON));

		GitHubRepo[] result = service.getGitHubUserRepos("octocat");

		assertNotNull(result);
	}


	@Test
	void serviceThrowsExceptionWhenNoReposAreFound() {
		this.mockRestServiceServer.expect(requestTo("https://api.github.com/users/dontexist/repos"))
		.andRespond(MockRestResponseCreators.withStatus(HttpStatus.NOT_FOUND));

		assertThrows(ResponseStatusException.class, () -> service.getGitHubUserRepos("dontexist"));
	}

}
