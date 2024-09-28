# BranchDemo
This service provides an endpoint that returns a subset of a User's GitHub data.

## Installation
* Make sure you have JDK21 and Maven 3.x
* Clone the repo
   ```sh
   git clone https://github.com/treichk/BranchDemo.git
   ```
* Run the service
   ```sh
    cd BranchDemo
    mvnw spring-boot:run
   ```
## Usage
The endpoint of the service:
```sh
  http://localhost:8080/users/{username}
```
Returns data in the following format (ex:  http://localhost:8080/users/octocat):
```json
{
    "user_name": "octocat",
    "display_name": "The Octocat",
    "avatar": "https://avatars.githubusercontent.com/u/583231?v=4",
    "geo_location": "San Francisco",
    "email": null,
    "url": "https://github.com/octocat",
    "created_at": "2011-01-25T18:44:36.000+00:00",
    "repos": [
        {
            "name": "boysenberry-repo-1",
            "url": "https://github.com/octocat/boysenberry-repo-1"
        }
    ]
}
```
The username must contain only alphanumeric and hyphen characters.

## About the service
This service is a simple REST web service that uses common libraries.  It contains a controller and a services/components
to call GitHub's APIs.  Basic logging and caching is included.  The code assumes that valid GitHub username's have only 
alphanumeric characters and hyphens.  If GitHub's APIs return NOT_FOUND, this service will also return a status of NOT_FOUND.
The cache expires after 12 hours in case the GitHub user data has changed. 

Unit tests are included that test the core functionality, username validation, and caching.
