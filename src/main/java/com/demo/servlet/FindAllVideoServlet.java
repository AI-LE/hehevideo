package com.demo.servlet;

import com.demo.dao.UserDao;
import com.demo.dao.VideoDao;
import com.demo.repo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindAllVideoServlet")
public class FindAllVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FindAllVideoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");

		VideoDao videoDao = VideoDao.getInstance();
		List<String> list = videoDao.findAll();
		StringBuilder json = new StringBuilder();
		json.append("{\"video\":[");
		System.out.println("查找到的内容为: ");
		for (String s: list) {
			System.out.println(s);
			json.append("{\"url\":\""+s+"\"},");
		}
		json.append("]}");

		System.out.println(json.toString().replaceAll(",]}","]}"));
		response.getWriter().write(json.toString().replaceAll(",]}","]}"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
