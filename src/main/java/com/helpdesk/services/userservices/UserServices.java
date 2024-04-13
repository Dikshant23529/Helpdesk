package com.helpdesk.services.userservices;

import com.helpdesk.entity.user.User;

public interface UserServices {
    
    User registerUser (User user);

    User findUserByEmail(String email);

}
