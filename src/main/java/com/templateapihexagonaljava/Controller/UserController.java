package com.templateapihexagonaljava.Controller;


import com.templateapihexagonaljava.Application.IUserService;
import com.templateapihexagonaljava.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserService _userService;

    @PostMapping("/createuser")
    public UUID createUser(@RequestBody User user) {
        return _userService.createUser(user);
    }

    @GetMapping("/getuser/{userName}")
    public User getuser(@PathVariable("userName")  String userName) {
        return _userService.getuser(userName);
    }

    @GetMapping("/getAlluser")
    public List<User> getAlluser() {
        return _userService.getAllUser();
    }
}
