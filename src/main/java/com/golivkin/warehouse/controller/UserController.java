package com.golivkin.warehouse.controller;



import com.golivkin.warehouse.model.User;
import com.golivkin.warehouse.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> showAllUsers(){

        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User  getUser(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        userService.save(user);

        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        userService.save(user);

        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id){

        userService.deleteById(id);
    }
}
