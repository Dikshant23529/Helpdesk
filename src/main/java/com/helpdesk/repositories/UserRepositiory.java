package com.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helpdesk.entity.user.User;

public interface UserRepositiory extends JpaRepository<User, Integer>{
    
    public User findByEmail(String email);

    public User findByUserUniqueId(String userUniqueId);

}
