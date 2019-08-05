package com.example.ifit.service;

import com.example.ifit.dao.CommendDao;
import com.example.ifit.entity.Commend;
import com.example.ifit.mapper.CommendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommendService {
    @Autowired
    CommendDao commendDao;

    public Commend findCommendById(Long id){
        return commendDao.findCommendById(id);
    }

    public boolean insertCommend(Long userId,Long videoId,String text){
        Commend commend = new Commend();
        commend.setUserId(userId);
        commend.setVideoId(videoId);
        commend.setText(text);
        return commendDao.insertCommend(commend);
    }

    public boolean deleteCommendById(Long id){
        return commendDao.deleteCommendById(id);
    }

    public boolean updateText(Long id,Long userId,String text){
        Commend commend = new Commend();
        commend.setId(id);
        commend.setUserId(userId);
        commend.setText(text);
        return commendDao.updateText(commend);
    }
}
