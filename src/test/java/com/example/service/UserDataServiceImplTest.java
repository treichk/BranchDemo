package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import dto.UserDataRepo;
import dto.UserDataUser;
import dto.github.GitHubUser;
import dto.github.repo.GitHubRepo;

@ExtendWith(MockitoExtension.class)
class UserDataServiceImplTest {

	@Mock 
	GitHubService githubService;

	@InjectMocks
	UserDataServiceImpl userDataService;

	@Test
	void testUserDataService() {
		Mockito.when(githubService.getGitHubUserData("octocat")).thenReturn(createTestGitHubUser());
		Mockito.when(githubService.getGitHubUserRepos("octocat")).thenReturn(createTestRepos());

		UserDataUser testUser = userDataService.getUserData("octocat");

		assertEquals("octocat", testUser.getUserName(), "The username is incorrect");
		assertEquals("The Octocat", testUser.getDisplayName(), "The display name is incorrect");
		assertEquals(URI.create("https://AvatartestURL"), testUser.getAvatar(), "The avatar is incorrect");
		assertEquals("San Francisco", testUser.getGeoLocation(), "The geolocation is incorrect");
		assertNull(testUser.getEmail(), "The email should be null");
		assertEquals(URI.create("https://TestURL"), testUser.getUrl(), "The url is incorrect");
		assertEquals("2024-05-05 15:22:12", testUser.getCreatedAt(), "The create at is incorrect");

		List<UserDataRepo> repos = testUser.getRepos();
		assertEquals(2, repos.size(), "Repo size is incorrect");
		assertEquals("testRepo", repos.get(0).getName(), "The first name is incorrect");
		assertEquals(URI.create("https://testRepoURL"), repos.get(0).getUrl(), "The first url is incorrect");
		assertEquals("anotherRepo", repos.get(1).getName(), "The second name is incorrect");
		assertEquals(URI.create("https://anotherRepoURL"), repos.get(1).getUrl(), "The second url is incorrect");
	}

	private GitHubUser createTestGitHubUser() {
		GitHubUser ghUser = new GitHubUser();
		ghUser.setLogin("octocat");
		ghUser.setName("The Octocat");
		ghUser.setAvatarUrl(URI.create("https://AvatartestURL"));
		ghUser.setLocation("San Francisco");
		ghUser.setCreatedAt(LocalDateTime.parse("2024-05-05T15:22:12"));
		ghUser.setEmail(null);
		ghUser.setHtmlUrl(URI.create("https://TestURL"));
		return ghUser;
	}

	private GitHubRepo[] createTestRepos() {
		GitHubRepo ghRepo1 = new GitHubRepo();
		ghRepo1.setName("testRepo");
		ghRepo1.setHtmlUrl(URI.create("https://testRepoURL"));
		GitHubRepo ghRepo2 = new GitHubRepo();
		ghRepo2.setName("anotherRepo");
		ghRepo2.setHtmlUrl(URI.create("https://anotherRepoURL"));
		GitHubRepo[] ghRepos = Arrays.array(ghRepo1, ghRepo2);
		return ghRepos;
	}


}
