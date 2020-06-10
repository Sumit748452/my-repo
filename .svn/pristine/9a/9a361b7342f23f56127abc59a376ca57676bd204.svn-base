package com.oredoo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oredoo.dao.portalDAO;
import com.oredoo.entity.IUserDetail;
import com.oredoo.service.portalService;

	

@Service
public class processServiceImpl implements portalService {
	
	@Autowired
	private portalDAO objportalDAO;

	@Override
	public List<IUserDetail> getUserDetails() {
		// TODO Auto-generated method stub
		return objportalDAO.getUserDetails();
	}

	@Override	
	public List<Object> getMisData(String partner, String month, String month2,Integer type,Integer source) {
		// TODO Auto-generated method stub
		return objportalDAO.getMisData(partner,month,month2,type,source);
	}
	
	@Override
	public List<Object> getMisDownload(String partner, String month) {
		// TODO Auto-generated method stub
		return objportalDAO.getMisDownload( partner,  month);
	}

	@Override
	public List<Object> getMisData1(String partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub
		
		return objportalDAO.getMisData1(partner,month,month2,type,source);
	}

	@Override
	public List<Object> getMisDataContent(Integer partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub
		return objportalDAO.getMisDataContent(partner,month,month2,type,source);
	}

	@Override
	public List<Object> getMisDataContentG(Integer id, String datefrom, String dateto, Integer type, int i) {
		// TODO Auto-generated method stub
		return objportalDAO.getMisDataContentG(id,datefrom,dateto,type,i);
	}

	@Override
	public List<Object> getMisDataWeb(String partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub
		return objportalDAO.getMisDataWeb(partner,month,month2,type,source);
	}

	@Override
	public List<Object> getMisDataWebC(Integer id, String datefrom, String dateto, Integer type, int i) {
		// TODO Auto-generated method stub
		return objportalDAO.getMisDataWebC(id,datefrom,dateto,type,i);
	}


}
