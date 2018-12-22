package com.courses.restservices.versioning;

/**
 * Created by pasindu on 2018-12-06.
 * rest-service
 * com.courses.restservices.versioning
 *
 * WITH THE PASSING OF TIME, NEW API CONSUMERS WANT TO GET NAME AS FIRSTNAME AND LASTNAME. BUT OLD CONSUMERS STILL WANT TO GET NAME AS A STRING
 *
 */
public class PersonV2
{
	private Name name;

	public PersonV2()
	{
		super();
	}

	public PersonV2( Name name )
	{
		this.name = name;
	}

	public Name getName()
	{
		return name;
	}

	public void setName( Name name )
	{
		this.name = name;
	}
}
