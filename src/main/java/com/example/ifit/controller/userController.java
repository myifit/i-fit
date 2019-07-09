package com.example.ifit.controller;


import com.example.ifit.entity.user;
import com.example.ifit.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private userMapper userMapper1;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<user> getBytel(@RequestParam("tel") String tel){
        return ResponseEntity.ok(userMapper1.findBytel(tel));
    }
}
