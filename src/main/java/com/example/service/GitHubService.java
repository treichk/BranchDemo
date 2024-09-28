package com.example.service;

import java.net.URI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import dto.github.GitHubUser;
import dto.github.repo.GitHubRepo;

@Component
public class GitHubService {

	private final RestTemplate restTemplate;

	public GitHubService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder
				.errorHandler(new NotFoundErrorHandler())
				.additionalInterceptors(new LoggingInterceptor())
                .requestFactory(() -> new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()))
				.build();
	}

	public GitHubUser getGitHubUserData(String username) {
		URI uri = UriComponentsBuilder
				.fromUriString("https://api.github.com/users")
				.pathSegment(username)
				.encode()
				.build()
				.toUri();
		return restTemplate.getForObject(uri, GitHubUser.class);
	}
	
	public GitHubRepo[] getGitHubUserRepos(String username) {
		URI uri = UriComponentsBuilder
				.fromUriString("https://api.github.com/users")
				.pathSegment(username)
				.pathSegment("repos")
				.encode()
				.build()
				.toUri();
		return restTemplate.getForObject(uri, GitHubRepo[].class);
	}
}
