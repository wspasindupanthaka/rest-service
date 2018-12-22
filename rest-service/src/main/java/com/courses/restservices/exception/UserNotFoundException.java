package com.courses.restservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by pasindu on 2018-11-29.
 * rest-service
 * com.courses.restservices.restservices.exception
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException
{
	public UserNotFoundException( String s )
	{
		super( s );
	}
}
//tests