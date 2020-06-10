package com.oredoo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oredoo.dao.LoginDAO;
import com.oredoo.entity.IUser;
import com.oredoo.entity.IUserDetail;



@Repository
@Transactional

public class LoginDAOImpl implements LoginDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public IUser validateUser(String msisdn, String password) {
		// TODO Auto-generated method stub
		//boolean status = false;
		IUser iuser=null;
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(IUser.class);
		crit.add(Restrictions.eq("login", msisdn));
		crit.add(Restrictions.eq("enabled", 1));
		//crit.add(Restrictions.eq("roleid", "9"));


		
		//crit.add(Restrictions.eq("password", password));
		//crit.add(Restrictions.eq("status", "0"));

		List<IUser> list = new ArrayList<IUser>();
		crit.setMaxResults(1);
		list = crit.list();
		if (list.size() > 0) {
			iuser = list.get(0);
		} 

		return iuser;
	}
	@Override
	public IUserDetail validateUserDetails(Long id) {
		// TODO Auto-generated method stub
		IUserDetail iuser=null;

		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(IUserDetail.class);
		crit.add(Restrictions.eq("uid", id));
		//crit.add(Restrictions.eq("enabled", 1));

		
		//crit.add(Restrictions.eq("password", password));
		//crit.add(Restrictions.eq("status", "0"));

		List<IUserDetail> list = new ArrayList<IUserDetail>();
		crit.setMaxResults(1);
		list = crit.list();
		if (list.size() > 0) {
			iuser = list.get(0);
		} 

		return iuser;
	}
	/*
	@Override
	public boolean validateUser(String msisdn) {
		// TODO Auto-generated method stub
		boolean status = false;
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(IUser.class);
		crit.add(Restrictions.eq("msisdn", msisdn));

		List<IUser> list = new ArrayList<IUser>();
		crit.setMaxResults(1);
		list = crit.list();
		if (list.size() > 0) {
			status = true;
		} else {
			status = false;
		}

		return status;
	}

	@Override
	public void createUser(IUser iuser) {
		// TODO Auto-generated method stub
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(iuser);
		} catch (Exception ex)

		{
			ex.printStackTrace();
		}
	}

	@Override
	public void pininfo(UserAuth iuser) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(iuser);
		} catch (Exception ex)

		{
			ex.printStackTrace();
		}

	}

	@Override
	public UserAuth validatePin(String msisdn, String password) {
		// TODO Auto-generated method stub
		// boolean status = false;
		UserAuth objUserAuth = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(UserAuth.class);
		crit.add(Restrictions.eq("msisdn", msisdn));
		crit.add(Restrictions.eq("pin", password));
		crit.addOrder(Order.asc("id"));

		List<UserAuth> list = new ArrayList<UserAuth>();
		crit.setMaxResults(1);
		
		list=crit.list();
		if(list.size()>0) {
		objUserAuth = (UserAuth) list.get(0);
		}
		
		 * if (list.size() > 0) { status = true; } else { status = false; }
		 

		return objUserAuth;
	}

	@Override
	public void updateStatus(UserAuth iuser) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.update(iuser);
		} catch (Exception ex)

		{
			ex.printStackTrace();
		}
		
	}*/

	

}
