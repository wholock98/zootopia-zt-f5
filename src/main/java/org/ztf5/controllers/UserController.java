package org.ztf5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.ztf5.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    
    @Autowired
    UserService userService;

    public void getUserById(Long id){
        userService.getUserById(id);
    }
    
}
