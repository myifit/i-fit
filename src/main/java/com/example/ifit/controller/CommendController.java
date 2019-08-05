package com.example.ifit.controller;

import com.example.ifit.entity.Commend;
import com.example.ifit.service.CommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commend")
public class CommendController {
    @Autowired
    private CommendService commendService;
    @GetMapping("/{id}")
    @ResponseBody
    public Commend findCommendById(@PathVariable("id") Long id){return commendService.findCommendById(id);}

    @PostMapping("/insertCommend")
    public boolean insertCommend(@RequestParam("userId") Long userId,@RequestParam("videoId") Long videoId,@RequestParam("text") String text){
        return commendService.insertCommend(userId,videoId,text);
    }

    @GetMapping("/deleteCommend")
    public boolean deleteCommendById(@RequestParam("id") Long id){
        return commendService.deleteCommendById(id);
    }

    @GetMapping("/updateText")
    public boolean updateText(@RequestParam("id") Long id,@RequestParam("userId") Long userId,@RequestParam("text") String text){
        return commendService.updateText(id,userId,text);
    }
}
