package com.elitecore.services;

import com.elitecore.dto.userdto;
import com.elitecore.model.User;

public class transfer {
public static User trans(userdto u)
{
	User user1=new User();
	user1.setUserName(u.getUsername());
	user1.setPassword(u.getPassword());
	user1.setPhone_no(u.getPhone_no());
	return user1;
}
}
