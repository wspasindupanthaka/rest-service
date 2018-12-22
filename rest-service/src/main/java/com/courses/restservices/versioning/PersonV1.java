package com.courses.restservices.versioning;

/**
 * Created by pasindu on 2018-12-06.
 * rest-service
 * com.courses.restservices.versioning
 */
public class PersonV1
{
	private String name;

	public PersonV1()
	{
		super();
	}

	public PersonV1( String name )
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}
}
