package com.example.ifit.mapper;

import com.example.ifit.entity.Plan;
import com.example.ifit.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface PlanMapper {

    int insertPlan(Plan plan);

    boolean deleteById(long id);

    List<Plan> listfindByVideoId(long video_id);

    List<Plan> listfindByUserId(long user_id);
}
