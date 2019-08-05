package com.example.ifit.dao;

import com.example.ifit.entity.Commend;
import com.example.ifit.mapper.CommendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommendDao {
    @Autowired
    CommendMapper commendMapper;

    public Commend findCommendById(Long id){
        return commendMapper.findCommendById(id);
    }

    public boolean insertCommend(Commend commend){return commendMapper.insertCommend(commend);}

    public boolean deleteCommendById(Long id){return commendMapper.deleteCommendById(id);}

    public boolean updateText(Commend commend){return commendMapper.updateText(commend);}
}
