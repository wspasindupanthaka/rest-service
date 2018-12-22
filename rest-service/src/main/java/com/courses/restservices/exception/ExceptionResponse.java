package com.courses.restservices.exception;

import java.util.Date;

/**
 * Created by pasindu on 2018-11-29.
 * rest-service
 * com.courses.restservices.restservices.exception
 */
public class ExceptionResponse
{
	private Date timeStamp;
	private String message;
	private String details;

	public ExceptionResponse()
	{
	}

	public ExceptionResponse( Date timeStamp, String message, String details )
	{
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimeStamp()
	{
		return timeStamp;
	}

	public void setTimeStamp( Date timeStamp )
	{
		this.timeStamp = timeStamp;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}

	public String getDetails()
	{
		return details;
	}

	public void setDetails( String details )
	{
		this.details = details;
	}
}
//tests