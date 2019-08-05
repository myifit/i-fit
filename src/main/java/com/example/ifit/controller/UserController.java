package com.example.ifit.controller;


import com.example.ifit.entity.User;
import com.example.ifit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;


//@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("")
    @ResponseBody
    public ResponseEntity<User> getBytel(@RequestParam("tel") String tel){
        return ResponseEntity.ok(userMapper.findByTel(tel));
    }

    @PutMapping("/password/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updatePasswordById(@PathVariable("id") long id, @RequestParam("Password") String password){
        return ResponseEntity.ok(userMapper.updatePasswordById(password,id));
    }

    @PutMapping("/picture/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updatePictureById(@PathVariable("id") long id, @RequestParam("Picture") String picture){
        return ResponseEntity.ok(userMapper.updatePictureById(picture, id));
    }

    @PutMapping("/name/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> updatenameById(@PathVariable("id") long id, @RequestParam("Name") String name){
        return ResponseEntity.ok(userMapper.updateNameById(name, id));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") long id){
        return ResponseEntity.ok(userMapper.deleteById(id));
    }

    @PostMapping("/insert")
    @ResponseBody
    public ResponseEntity<Integer> addByUser(@RequestParam("Telephone") String telephone,@RequestParam("Name") String name,@RequestParam("Password") String password,@RequestParam("Picture") String picture){
        User user=new User();
        user.setTelephone(telephone);
        user.setName(name);
        user.setPassword(password);
        user.setPicture(picture);

        return ResponseEntity.ok(userMapper.insertUser(user));
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseEntity<Integer> register(@RequestParam("Telephone") String telephone,@RequestParam("Password") String password){
        User user=new User();
        user.setTelephone(telephone);
        user.setName("某人");
        user.setPassword(password);
        user.setPicture("123");

        return ResponseEntity.ok(userMapper.insertUser(user));
    }
}
