package f5.ztf5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.ztf5.models.User;
import f5.ztf5.services.UserService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200")
// @RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @GetMapping("/users/{id}")
    public void getUserById(@PathVariable("id") Long id) {
        userService.getUserById(id);
    }

}
