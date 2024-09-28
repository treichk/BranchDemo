package com.example.service;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.server.ResponseStatusException;

@Component
public class NotFoundErrorHandler extends DefaultResponseErrorHandler {

	@Override
	public void handleError(ClientHttpResponse httpResponse) throws IOException {
		if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Username not found.");
		}
	}
}
