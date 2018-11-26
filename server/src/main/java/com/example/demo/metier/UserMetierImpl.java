package com.example.demo.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entities.User;

@Service
public class UserMetierImpl implements UserMetier {
    @Autowired
    private UserRepository userRepositoy;

    @Override
    public User saveUser(User A) {

        return userRepositoy.save(A);
    }

    @Override
    public List<User> listUser() {
        return userRepositoy.findAll();
    }


}
