package com.controller;

import com.annotation.useractivation.UserActivation;
import com.dto.UserRequestDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUserByPhone(@RequestBody @Valid UserRequestDto userRequestDto) {
        return "User found";
    }

    @UserActivation
    @GetMapping("/1/{phoneNumber}")
    public String getFirstUserByPhone(@PathVariable String phoneNumber) {
        return "User found";
    }
}
