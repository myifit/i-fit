package com.example.ifit.controller;

import com.example.ifit.entity.Plan;
import com.example.ifit.entity.User;
import com.example.ifit.mapper.PlanMapper;
import com.example.ifit.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping("/plans")
public class PlanController {

    @Autowired
    private  PlanMapper planMapper;

    @GetMapping("/listfindByUserId")
    @ResponseBody
    public List<Plan> listfindByUserId(@RequestParam("User_id") long user_id) {
        List<Plan> plans = planMapper.listfindByUserId(user_id);
        return plans;
    }

    @GetMapping("/listfindByVideoId")
    @ResponseBody
    public List<Plan> listfindByVideoId(@RequestParam("Video_id") long video_id) {
        List<Plan> plans = planMapper.listfindByVideoId(video_id);
        return plans;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") long id){
        return ResponseEntity.ok(planMapper.deleteById(id));
    }

    @PostMapping("/insert")
    @ResponseBody
    public ResponseEntity<Integer> addByPlan(@RequestParam("Video_id") long video_id,@RequestParam("User_id") long user_id)
    {
        Plan plan=new Plan();
        plan.setVideoId(video_id);
        plan.setUserId(user_id);

        return ResponseEntity.ok(planMapper.insertPlan(plan));
    }
}
