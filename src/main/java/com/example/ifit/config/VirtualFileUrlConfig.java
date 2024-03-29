package com.example.ifit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class VirtualFileUrlConfig extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //文件磁盘url 映射
        //配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/studentfile/**").addResourceLocations("/resources/studentfile/");
        registry.addResourceHandler("/ppt/**").addResourceLocations("/upload/ppt/");
        registry.addResourceHandler("/video/**").addResourceLocations("/upload/video/");
        registry.addResourceHandler("/report/**").addResourceLocations("/resources/report/");
    }

}
