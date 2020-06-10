package com.oredoo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oredoo.dao.LoginDAO;
import com.oredoo.entity.IUser;
import com.oredoo.entity.IUserDetail;
import com.oredoo.service.LoginService;


/*import com.qnawat.entity.IUser;
import com.qnawat.entity.UserAuth;
*/
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginDAO logDao;

	@Override
	public IUser validateUser(String msisdn, String password) {
		// TODO Auto-generated method stub

		return logDao.validateUser(msisdn, password);
	}
	@Override
	public IUserDetail validateUserDetails(Long id) {
		// TODO Auto-generated method stub
		return logDao.validateUserDetails(id);
	}
	/*
	@Override
	public boolean validateUser(String msisdn) {
		// TODO Auto-generated method stub

		return logDao.validateUser(msisdn);
	}
	
	@Override
	public void createUser(IUser iuser) {
		// TODO Auto-generated method stub
		logDao.createUser(iuser);
	}

	@Override
	public void pininfo(UserAuth iuser) {
		// TODO Auto-generated method stub
		logDao.pininfo(iuser);

	}

	@Override
	public UserAuth validatePin(String msisdn, String password) {
		// TODO Auto-generated method stub
		return logDao.validatePin(msisdn, password);
	}

	@Override
	public void updateStatus(UserAuth iuser) {
		// TODO Auto-generated method stub
		 logDao.updateStatus(iuser);

	}
*/

	
}
