package com.courses.restservices.versioning;

/**
 * Created by pasindu on 2018-12-06.
 * rest-service
 * com.courses.restservices.versioning
 */
public class Name
{
	private String firstName;
	private String lastName;

	public Name()
	{
	}

	public Name( String firstName, String lastName )
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}
}
