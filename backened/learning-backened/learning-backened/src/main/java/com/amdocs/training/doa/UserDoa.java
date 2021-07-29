package com.amdocs.training.doa;
import java.util.List;


import com.amdocs.training.controller.User;
public interface UserDoa {

	List<User> findAll();


	boolean addUser(User User);

	User getUserById(String id);

	boolean deleteUser(String id);
	
	void updateUser(String id,String Password);
}	
	