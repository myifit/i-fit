package com.example.ifit.mapper;

import com.example.ifit.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     *
     * @param telephone
     * @return
     */
    User findBytel(String telephone);

    int insertUser(User user);

    boolean deleteById(long id);

    boolean updatePasswordById(@Param("Password") String password, @Param("Id") long id);

    boolean updateNameById(@Param("Name") String name,@Param("Id") long id);

    boolean updatePictureById(@Param("Picture") String picture,@Param("Id") long id);


}
