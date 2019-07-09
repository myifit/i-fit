package com.example.ifit.mapper;

import com.example.ifit.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     *
     * @param telephone
     * @return
     */
    User findBytel(String telephone);

}
