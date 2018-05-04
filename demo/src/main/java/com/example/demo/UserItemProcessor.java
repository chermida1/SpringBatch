package com.example.demo;

import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User,User>{

	@Override
	public User process(User item) throws Exception {
		User modified_User = new User();
		modified_User.setMobile(item.getMobile().toUpperCase());
		modified_User.setName(item.getName().toUpperCase());
		return modified_User;
	}

}
