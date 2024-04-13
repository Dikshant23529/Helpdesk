package com.helpdesk.services.impl.userimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.entity.user.User;
import com.helpdesk.repositories.UserRepositiory;
import com.helpdesk.services.userservices.UserServices;

@Service
public class UserImpl implements UserServices {

    @Autowired
    private UserRepositiory userRepositiory;

    @Override
    public User registerUser(User user) {

        User userGetByEmail = userRepositiory.findByEmail(user.getEmail());

        if (userGetByEmail != null) {
            throw new IllegalArgumentException("User already registered with the give email id" + user.getEmail());
        }

        return this.userRepositiory.save(user);

    }

    @Override
    public User findUserByEmail(String email) {
       User getUserByEmail = this.userRepositiory.findByEmail(email);
        return getUserByEmail;    
    }

}
