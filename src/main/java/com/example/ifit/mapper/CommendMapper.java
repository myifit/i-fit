package com.example.ifit.mapper;

import com.example.ifit.entity.Commend;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommendMapper{
    /**
     *查
     * @param id
     * @return
     */
    Commend findCommendById(Long id);

    /**
     *删
     * @param id
     * @return
     */
    boolean deleteCommendById(Long id);

    /**
     *
     * @param commend
     * @return
     */
    boolean insertCommend(Commend commend);

    boolean updateText(Commend commend);//一个参数，为一个类
//    boolean updateText(Long id,Long userId,String text);//用这个会报错
//    //错误信息"nested exception is org.apache.ibatis.binding.BindingException:
//    // Parameter 'text' not found. Available parameters are [arg2, arg1, arg0, param3, param1, param2]",
//    //正确多参数
//    boolean updateText(@Param("id") Long id,@Param("userId") Long userId,@Param("text") String text);


}
