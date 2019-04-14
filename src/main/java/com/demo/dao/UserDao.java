package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.repo.User;
import com.demo.util.DBConnection;
import com.mysql.jdbc.Statement;

public class UserDao {
	
	DBConnection db = new DBConnection();

	{
		System.out.println(this.a);
		a = 100;
		System.out.println(this.a);
	}
	private  int  a;


	/**
	 * 查找所有用户信息
	 * @return List<User>
	 */
	public List<User> findUsers(){
		String sql = "select * from User";
		List<User> list = new ArrayList<User>();
		try {
			Statement stmt = (Statement) db.conn.createStatement();
			 ResultSet rs = (ResultSet) stmt.executeQuery(sql);
	         while(rs.next()){
	        	 User user = new User();
	        	 user.setAccount(rs.getString("account"));
	        	 user.setPassword(rs.getString("password"));
	        	 list.add(user);
	         }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 数据库保存用户
	 * @param user 用户信息
	 * @return boolean
	 */
	public boolean saveUser(User user) {
		Statement statement= null;
		int rs = 0;
		try {
			statement = (Statement) db.conn.createStatement();
			String sql = "insert into User values('"+user.getAccount()+"','"+user.getPassword()+"')";
			System.out.println(sql);
			rs = statement.executeUpdate(sql);
		} catch (SQLException e) {
			return false;
		}
		if (rs == 1) 
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		//userDao.findUsers();
		User user = new User("hah","hiihih");
		boolean flag = userDao.saveUser(user);
		System.out.println(flag);
	}
	
}
