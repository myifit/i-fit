package com.example.ifit.mapper;

import com.example.ifit.entity.*;

public interface UserMapper {
    /**
     *
     * @param telephone
     * @return
     */
    User findBytel(String telephone);

}
