package com.courses.restservices.dynamicfiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pasindu on 2018-12-06.
 * rest-service
 * com.courses.restservices.restservices.controller
 */

@RestController
public class DynamicFilteringController
{
	@RequestMapping(value = "/dynamic-filtering", method = RequestMethod.GET)
	public MappingJacksonValue retrieveSomeBean() {

		DynamicSomeBean dynamicSomeBean = new DynamicSomeBean( "value1", "value2", "value3" );

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept( "field1","field2" );

		FilterProvider filterProvider = new SimpleFilterProvider(  ).addFilter( "DynamicSomeBeanFilter",filter );

		MappingJacksonValue  mapping = new MappingJacksonValue( dynamicSomeBean );
		mapping.setFilters( filterProvider );

		return  mapping;
	}
}
