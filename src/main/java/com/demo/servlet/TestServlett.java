package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.UserDao;
import com.demo.repo.*;


@WebServlet("/TestServlett")
public class TestServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public TestServlett() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		UserDao userDao = new UserDao();
		List<User> list = userDao.findUsers();

		String json ="{\"d\":[";
		for (User user : list) {
			json+="{\"account\":\""+user.getAccount()+"\",\"password\":\""+user.getPassword()+"\"},";
		}
		json +="]}";
		json = json.replaceAll(",]}", "]}");
		//System.out.println(json);
		response.getWriter().write(json);

	}
	

}
