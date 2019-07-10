package com.example.ifit.mapper;

import com.example.ifit.entity.Plan;
import com.example.ifit.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface PlanMapper {
    /**
     *
     * @param plan
     * @return
     */
    int insertPlan(Plan plan);

    /**
     *
     * @param id
     * @return
     */
    boolean deleteById(long id);

    /**
     *
     * @param video_id
     * @return
     */
    List<Plan> listfindByVideoId(long video_id);

    /**
     *
     * @param user_id
     * @return
     */
    List<Plan> listfindByUserId(long user_id);
}
