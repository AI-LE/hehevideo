package com.demo.service;

import com.demo.dao.VideoDao;
import com.demo.repo.Video;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class VideoService {

    private static VideoService videoService = new VideoService();

    private VideoService(){
        System.out.println("VideoService的构造方法执行了......");
    }
    public static VideoService getInstance(){
        return videoService;
    }


    VideoDao videoDao = VideoDao.getInstance();

    /**
     * 服务层保存视频方法
     * @param video
     * @return
     */
    public boolean saveVideo(Video video){
        video.setVideoId(videoDao.findNowUserId());
        video.setVideoUrl("/");
        SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
        video.setCreateTime(df.format(new Date()));
        boolean isSaved = videoDao.saveVideo(video);
        if (isSaved)
            return true;
        return false;
    }

    public List<Video> findAllVideo(){

        VideoDao videoDao = VideoDao.getInstance();
        System.out.println("videoDao实例的Hashcode： "+videoDao.hashCode());
        videoDao.findAll();
        return null;
    }

}
