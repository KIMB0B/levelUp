package com.levelup.songandlupin.user.controller;

import com.levelup.songandlupin.user.dto.UserInputDto;
import com.levelup.songandlupin.user.entity.UserEntity;
import com.levelup.songandlupin.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public UserEntity saveUser(@RequestBody UserInputDto userInputDto) {
        return userService.save(userInputDto);
    }
}
