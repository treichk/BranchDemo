package com.example.service;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserDataRepo;
import dto.UserDataUser;
import dto.github.GitHubUser;
import dto.github.repo.GitHubRepo;

@Service
public class UserDataServiceImpl implements UserDataService {
	
	@Autowired
	GitHubService githubService;
	
	private Logger logger = LoggerFactory.getLogger(UserDataServiceImpl.class);

	@Override
	public UserDataUser getUserData(String username) {
		logger.debug("Getting user data: " + username);
		GitHubUser githubUser = githubService.getGitHubUserData(username);
		List<UserDataRepo> repoList = getRepoList(username);

		UserDataUser userDataUser = new UserDataUser();
		userDataUser.setUserName(githubUser.getLogin());
		userDataUser.setDisplayName(githubUser.getName());
		userDataUser.setAvatar(githubUser.getAvatarUrl());
		userDataUser.setGeoLocation(githubUser.getLocation());
		userDataUser.setEmail(githubUser.getEmail());
		userDataUser.setUrl(githubUser.getHtmlUrl());
		userDataUser.setCreatedAt(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(githubUser.getCreatedAt())); 
		userDataUser.setRepos(repoList);
		
		if (logger.isDebugEnabled())
			logger.debug("Returning userdata: " + userDataUser.toString());
		return userDataUser;
	}

	private List<UserDataRepo> getRepoList(String username) {
		GitHubRepo[] repoArray = githubService.getGitHubUserRepos(username);

		List<UserDataRepo> repoList = Arrays.asList(repoArray).stream()
			.map(repo -> new UserDataRepo(repo.getName(), repo.getHtmlUrl()))
			.collect(Collectors.toList());
		return repoList;
	}
}
