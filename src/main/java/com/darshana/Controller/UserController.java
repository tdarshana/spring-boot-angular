package com.darshana.Controller;

import com.darshana.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.darshana.service.UserService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private UserService userService;

    @Autowired
    UserController (UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }
}
