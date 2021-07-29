package com.amdocs.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.amdocs.training.controller.User;
import com.amdocs.training.doa.UserDoa;
class UserDaoUnitTest {

	@Test
	@Order(value=1)
	void Test_add_user_success(){
		User use=new User(112L, "karnik", "12/2/12", "Delhi", 4565465L,"qw@amd", "kc.jpg", "12121");
	    
		assertArrayEquals(true, UserDoa.addUser(use));
	}

}
