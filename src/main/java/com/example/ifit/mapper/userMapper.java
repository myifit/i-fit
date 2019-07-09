package com.example.ifit.mapper;

import com.example.ifit.entity.*;

public interface userMapper {
    /**
     *
     * @param telephone
     * @return
     */
    user findBytel(String telephone);

}
