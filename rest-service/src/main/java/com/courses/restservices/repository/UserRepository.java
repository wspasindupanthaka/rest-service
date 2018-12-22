package com.courses.restservices.repository;

import com.courses.restservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pasindu on 2018-12-14.
 * rest-service
 * com.courses.restservices.repository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{

}
