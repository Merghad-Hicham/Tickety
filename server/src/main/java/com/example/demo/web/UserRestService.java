package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.metier.UserMetier;

@RestController
public class UserRestService {
    @Autowired
    private UserMetier userMetier;

    @RequestMapping(value = "/User", method = RequestMethod.POST)
    public User saveUser(@RequestBody User A) {
        return userMetier.saveUser(A);
    }

    @RequestMapping(value = "/User", method = RequestMethod.GET)
    public List<User> listUser() {
        return userMetier.listUser();
    }

}
