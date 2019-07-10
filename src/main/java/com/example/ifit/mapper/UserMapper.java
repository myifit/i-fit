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

    /**
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     *
     * @param id
     * @return
     */
    boolean deleteById(long id);

    /**
     *
     * @param password
     * @param id
     * @return
     */
    boolean updatePasswordById(@Param("Password") String password, @Param("Id") long id);

    /**
     *
     * @param name
     * @param id
     * @return
     */
    boolean updateNameById(@Param("Name") String name,@Param("Id") long id);

    /**
     *
     * @param picture
     * @param id
     * @return
     */
    boolean updatePictureById(@Param("Picture") String picture,@Param("Id") long id);


}
