package com.demo.servlet;

import com.demo.repo.Video;
import com.demo.service.VideoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SaveVideoServlet")
public class SaveVideoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("SaveVideoServlet访问了！");
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        String fileName = request.getParameter("file");
        String videoName = request.getParameter("videoName");
        String videoInfo = request.getParameter("videoInfo");
        Integer videoTypeId = Integer.parseInt(request.getParameter("videoTypeId"));
        System.out.println(fileName+"   "+videoName+"   "+videoInfo+"   "+videoTypeId);
        VideoService videoService = VideoService.getInstance();
        Video video = new Video();
        video.setVideoName(videoName);
        video.setVideoInfo(videoInfo);
        video.setVideoTypeId(videoTypeId);
        //video.setVideoId((int)request.getSession().getAttribute("userId"));
        System.out.println("===============SaveVideoServlet========================");
        //response.getWriter().write("aisuhdfua");
        boolean isSaved = videoService.saveVideo(video);
        if (isSaved){
            request.getRequestDispatcher("videos.jsp").forward(request,response);
//            response.sendRedirect("videoShow.jsp");
        }else {
            //response.sendRedirect("videoShow.jsp");
            //返回保存失败的json串
        }
    }
}
