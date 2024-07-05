package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class UserController{
    private final UserService userService;

    @GetMapping("/user/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/user/save")
    public String save(@ModelAttribute UserDTO userDTO) {
        System.out.println("UserController.save");
        System.out.println("userDTO = " + userDTO);
        userService.save(userDTO);

        return "index";
    }
    
}