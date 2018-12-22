package com.courses.restservices.staticfiltering;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pasindu on 2018-12-06.
 * rest-service
 * com.courses.restservices.restservices.controller
 */

@RestController
public class StaticFilteringController
{
	@RequestMapping(value = "/static-filtering", method = RequestMethod.GET)
	public StaticSomeBean retrieveSomeBean() {
		return  new StaticSomeBean("value1","value2","value3");
	}
}
