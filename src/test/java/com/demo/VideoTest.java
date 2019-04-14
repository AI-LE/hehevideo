package com.demo;

import com.demo.dao.VideoDao;
import com.demo.service.VideoService;
import org.junit.Test;

import java.util.List;

public class VideoTest {

    @Test
    public void findAllVideoTest(){

        VideoService videoService = VideoService.getInstance();
        System.out.println(videoService.hashCode());

//        VideoDao videoDao = VideoDao.getInstance();
//        List<String> list = videoDao.findAll();
//        for (String s:list) {
//            System.out.println(s);
//        }
    }
}
