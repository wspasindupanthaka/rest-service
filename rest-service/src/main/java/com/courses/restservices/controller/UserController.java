package com.courses.restservices.controller;

import com.courses.restservices.exception.UserNotFoundException;
import com.courses.restservices.model.User;
import com.courses.restservices.service.dao.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class UserController
{

	@Autowired
	UserDaoService userDaoService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAll()
	{
		return userDaoService.findAll();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public Resource<User> findOne( @PathVariable long id )
	{
		User foundUser = userDaoService.findOne( id );
		if ( foundUser == null )
			throw new UserNotFoundException( "id - " + id );

		Resource<User> resource= new Resource<User>(foundUser);

		ControllerLinkBuilder linkToAllUsers = linkTo(ControllerLinkBuilder.methodOn(this.getClass()).getAll());

		resource.add(linkToAllUsers.withRel("all-users"));

		return resource;
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ResponseEntity saveUser(@Valid @RequestBody User savingUser )
	{
		User savedUser = userDaoService.saveUser( savingUser );

		return ResponseEntity.created( ServletUriComponentsBuilder.fromCurrentRequest().path( "/{id}" ).buildAndExpand( savedUser.getId() ).toUri() ).build();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public User deleteUser( @PathVariable int id )
	{
		User deletedUser = userDaoService.deleteById( id);

		if ( deletedUser == null )
		{
			throw new UserNotFoundException( "id - " + id );
		}

		return deletedUser;
	}

}
//tests