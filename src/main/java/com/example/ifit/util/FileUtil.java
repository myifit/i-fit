package com.example.ifit.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static boolean upload(String filePath, MultipartFile file){
        try{
            String fileName = file.getOriginalFilename();//获取文件名
            System.out.println(filePath);
            File myFile = new File(filePath);
            if(!myFile.getParentFile().exists())
                myFile.getParentFile().mkdirs();
            if(!myFile.exists())
                file.transferTo(myFile);
            return true;
        }
        catch(IllegalStateException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
}
