package com.helpdesk.controllers.usercontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helpdesk.entity.user.User;
import com.helpdesk.services.impl.userimpl.UserImpl;

@RestController
@RequestMapping("/api/v1/controller/user/")
public class UserControllers {

    @Autowired
    private UserImpl userImpl;

    @PostMapping("register")
    public ResponseEntity<User> saveUser(@RequestBody User user) {

        return new ResponseEntity<>(this.userImpl.registerUser(user), HttpStatus.CREATED);
    }

    @GetMapping("search")
    public ResponseEntity<User> getUserByEmail(@RequestBody String email){
       User user = this.userImpl.findUserByEmail(email);
       System.out.println(user);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }

}
