package com.demo.dao;


import com.demo.repo.Video;

import java.util.ArrayList;
import java.util.List;

/**
 * 视频持久化层
 */
public class VideoDao {

    /**
     * 单例模式返回VideoDao
     */
    private static VideoDao videoDao = new VideoDao();

    private VideoDao(){
        System.out.println("VideoDao的构造方法执行了......");
    }
    public static VideoDao getInstance(){
        return videoDao;
    }
    private int i = 0;

    /**
     *
     * 查找所有视频URL
     * 返回list
     * @return List<String>
     */
    public List<String> findAll(){
        List list = new ArrayList();
        list.add("demo/video.mp4");
        list.add("demo/videol.mp4");
        list.add("demo/videoll.mp4");
        return list;
    }


    public boolean saveVideo(Video video){

        i++;
        return true;
    }
    public int findNowUserId(){
        return i;
    }
}
