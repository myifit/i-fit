package com.example.ifit.service;

import com.example.ifit.dao.VideoDao;
import com.example.ifit.entity.Video;
import com.example.ifit.mapper.VideoMapper;
import com.example.ifit.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Service
public class VideoService {
    @Autowired
    VideoDao videoDao;
    public boolean uploadVideo(HttpServletRequest request, String name,String intro, Integer like, Integer unlike,
                               Integer recommend, Long authorId, Long courseId, Integer difficulty,String videoPath,
                               MultipartFile file){
        try{
            String tempPath = videoPath+file.getOriginalFilename();
            if (!file.isEmpty() && videoDao.uploadVideo(name,intro,like,unlike,recommend,authorId,courseId,difficulty,tempPath)) {
                /*BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(Ware_path)));
                out.write(file.getBytes());
                out.flush();
                out.close();*/
                boolean temp = FileUtil.upload(tempPath,file);
                if(temp==true)
                    return true;
                else
                    return false;
            } else {
                System.out.println("没插入");
                return false;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
