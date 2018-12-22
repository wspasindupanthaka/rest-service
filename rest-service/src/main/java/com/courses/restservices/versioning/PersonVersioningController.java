package com.courses.restservices.versioning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pasindu on 2018-12-06.
 * rest-service
 * com.courses.restservices.versioning
 */
@RestController
public class PersonVersioningController
{

	/**
	 * URI VERSIONING
	 * changing url
	 * @return
	 */

	@RequestMapping(value = "v1/person", method = RequestMethod.GET)
	public PersonV1 personV1()
	{
		return new PersonV1( "Bob Charlie" );
	}

	@RequestMapping(value = "v2/person", method = RequestMethod.GET)
	public PersonV2 personV2()
	{
		return new PersonV2( new Name( "Bob", "Charlie" ) );
	}

	/**
	 * REQUEST PARAMETER VERSIONING
	 * changing request params
	 * @return
	 */

	@RequestMapping(value = "person/param", params = "version=1", method = RequestMethod.GET)
	public PersonV1 personV1Param()
	{
		return new PersonV1( "Bob Charlie" );
	}

	@RequestMapping(value = "person/param", params = "version=2", method = RequestMethod.GET)
	public PersonV2 personV2Param()
	{
		return new PersonV2( new Name( "Bob", "Charlie" ) );
	}

	/**
	 * CUSTOM HEADERS VERSIONING
	 * changing headers
	 * @return
	 */


	@RequestMapping(value = "person/header", headers = "version=1", method = RequestMethod.GET)
	public PersonV1 personV1Header()
	{
		return new PersonV1( "Bob Charlie" );
	}

	@RequestMapping(value = "person/header", headers = "version=2", method = RequestMethod.GET)
	public PersonV2 personV2Header()
	{
		return new PersonV2( new Name( "Bob", "Charlie" ) );
	}

	/**
	 * MEDIA TYPE VERSIONING
	 * using produces
	 * 'Accept' header
	 * @return
	 */


	@RequestMapping(value = "person/produces", produces = "application/v1+json", method = RequestMethod.GET)
	public PersonV1 personV1Produces()
	{
		return new PersonV1( "Bob Charlie" );
	}

	@RequestMapping(value = "person/produces", produces = "application/v2+json", method = RequestMethod.GET)
	public PersonV2 personV2Produces()
	{
		return new PersonV2( new Name( "Bob", "Charlie" ) );
	}


}
