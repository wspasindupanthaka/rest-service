package com.courses.restservices.service.dao;

import com.courses.restservices.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    public static int userCount = 3;

    static {
        users.add(new User(1, "Pasindu", new Date()));
        users.add(new User(2, "Adam", new Date()));
        users.add(new User(3, "Eve", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User saveUser(User user) {
        if (user.getId() == 0)
            user.setId(++userCount);
        users.add(user);
        return user;
    }

    public User findOne(long id) {
        List<User> matchingUsers = users.stream().filter(user -> user.getId() == id).collect(Collectors.toList());
        if (!matchingUsers.isEmpty()) {
            return matchingUsers.get(0);
        }
        return null;
    }

    public User deleteById(int id) {
        User deletingUser = findOne(id);
        if (deletingUser != null) {
            users.removeIf(user -> user.getId()==id);
            return deletingUser;
        }
        throw null;
    }
}
//tests