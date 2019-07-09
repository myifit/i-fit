package com.example.ifit.controller;


import com.example.ifit.entity.User;
import com.example.ifit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserMapper userMapper1;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<User> getBytel(@RequestParam("tel") String tel){
        return ResponseEntity.ok(userMapper1.findBytel(tel));
    }
}
