package com.oredoo.dao;

import com.oredoo.entity.IUser;
import com.oredoo.entity.IUserDetail;


public interface LoginDAO {
	public IUser validateUser(String msisdn,String password);
	public IUserDetail validateUserDetails(Long id);



}
