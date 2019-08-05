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
    User findByTel(String telephone);

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
    boolean updatePasswordById(@Param("password") String password, @Param("id") long id);

    /**
     *
     * @param name
     * @param id
     * @return
     */
    boolean updateNameById(@Param("name") String name,@Param("id") long id);

    /**
     *
     * @param picture
     * @param id
     * @return
     */
    boolean updatePictureById(@Param("picture") String picture,@Param("id") long id);


}
