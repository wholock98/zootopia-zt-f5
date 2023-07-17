package org.ztf5.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ztf5.services.UserService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/User")
public class UserController {
    
    @Autowired
    UserService userService;

    public void getUserById(Long id){
        userService.getUserById(id);
    }
    
}
