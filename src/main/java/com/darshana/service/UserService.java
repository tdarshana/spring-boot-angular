package com.darshana.service;

import com.darshana.Entity.User;
import com.darshana.Repository.UserRepository;
import com.darshana.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserDto> getUsers() {
        List<UserDto> users = new ArrayList<>();
        userRepository.findAll().forEach(x -> users.add(UserDto.valueOf(x)));
        return users;
    }

    public UserDto saveUser(UserDto userDto){
        User user = userRepository.save(UserDto.valueOf(userDto));
        return UserDto.valueOf(user);
    }
}
