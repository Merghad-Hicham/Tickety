package com.example.demo.metier;

import java.util.List;

import com.example.demo.entities.User;

public interface UserMetier {
    public User saveUser(User A);

    public List<User> listUser();
}
