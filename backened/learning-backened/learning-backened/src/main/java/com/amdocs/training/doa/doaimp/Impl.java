package com.amdocs.training.doa.doaimp;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.controller.User;
import com.amdocs.training.dbutil.util.DbUtil;
import com.amdocs.training.doa.UserDoa;
public class Impl implements UserDoa {
	Connection conn = DbUtil.getConnection();

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from user";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String userid = rs.getString("userid");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String email = rs.getString("email");	
				String address = rs.getString("address");
				String password = rs.getString("password");
				String uploadImg = rs.getString("uploadphoto");
				String regDate = rs.getString("regdate");
				
				User user = new User(userid, name,password,phone,address,email,uploadImg, regDate);
				System.out.println(userid+" "+name+" "+phone+" "+email+" "+ address+" "+password+" "+uploadImg+" "+regDate);
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addUser(User User) {

		String query = "insert into user values(?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, User.getUserid());
			ps.setString(2, User.getName());
			ps.setString(3, User.getPassword());
	
			ps.setString(4, User.getPhone());
			
			ps.setString(5, User.getAddress());
			ps.setString(6, User.getEmail());
			ps.setString(7,User.getUploadImg());
			ps.setString(8,User.getRegDate());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
    
	@Override
	public User getUserById(String id) {
		try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE userid=" + id);

            if(rs.next())
            {
                String userid =  rs.getString("userid") ;
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String password = rs.getString("password");
                String regdate = rs.getString("regdate");
                String phone = rs.getString("phone");
                String uploadImg=rs.getString("uploadphoto");
               
                User user = new User(userid, name,password,phone,address,email,uploadImg, regdate);
                return user;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
		
		return null;
	}

	

	@Override
	public boolean deleteUser(String id) 
	{

		String q = "delete from user where userid=?";
		try {
			PreparedStatement ps = conn.prepareStatement(q);

			ps.setString(1, id);
			
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateUser(String id,String password) {
		String sql = "update user set password=?  where userid = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(2, id);
			ps.setString(1, password);
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate > 0) {
				System.out.println("Employee updated Successfully");
			}else {
				System.out.println("Try Again!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
