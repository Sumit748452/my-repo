
package com.oredoo.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oredoo.dao.portalDAO;
import com.oredoo.entity.AppStoreAPKDownload;
import com.oredoo.entity.IUser;
import com.oredoo.entity.IUserDetail;
import com.oredoo.entity.ListedAccount;

@Repository
@Transactional
public class portalDAOImpl implements portalDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<IUserDetail> getUserDetails() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(IUserDetail.class);

		//List<Long> uid=Arrays.asList(15l,20l,22l,29l,48l,50l,56l,58l,59l,60l,61l);
		List<Long> uid=getUsers();
		List<IUserDetail> list = new ArrayList<IUserDetail>();
		
		Disjunction orConditions = Restrictions.disjunction();
		orConditions.add(Restrictions.in("uid", uid));
		crit.add(orConditions); 
		list = crit.list();

		session.flush();
		//session.close();
		return list;
	}

	
	public List<Long> getUsers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(IUser.class);
		List<IUser> list = new ArrayList<IUser>();

		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("id"));
		crit.add(Restrictions.eq("enabled", 1));
		crit.add(Restrictions.eq("roleid", "9,"));
		list = crit.list();
		List<Long> list2 = new ArrayList<Long>();
         for(IUser objLo:list) {
        	 list2.add(objLo.getId());
        	 
         }
		

         session.flush();
			//session.close();
		return list2;
	}
	public List<String> getWNumbers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(ListedAccount.class);
		List<ListedAccount> list = new ArrayList<ListedAccount>();

		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("msisdn"));
		
		list = crit.list();
		List<String> list2 = new ArrayList<String>();
         for(ListedAccount objLo:list) {
        	 list2.add(objLo.getMsisdn());
        	 
         }
		

         session.flush();
			//session.close();
		return list2;
	}
	public List<Long> getINumbers() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(ListedAccount.class);
		List<ListedAccount> list = new ArrayList<ListedAccount>();

		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("token"));
		
		list = crit.list();
		List<Long> list2 = new ArrayList<Long>();
         for(ListedAccount objLo:list) {
        	 list2.add(objLo.getToken());
        	 
         }
		System.out.println(list2.toString()+list2);

         session.flush();
			//session.close();
		return list2;
	}

	/*
	 * @Override public List<Object> getMisData(String partner, String month,String
	 * month2) { // TODO Auto-generated method stub Date dt = new Date(); // Date
	 * dt2=new Date();
	 * 
	 * SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyyy"); Date date1 = null;
	 * try { date1 = df1.parse(month); } catch (ParseException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } Date date2 = null; try {
	 * date2 = df1.parse(month2); } catch (ParseException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd"); String dateFrom =
	 * df2.format(date1);
	 * 
	 * SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd"); String dateTo =
	 * df3.format(date2);
	 * 
	 * Session session = sessionFactory.getCurrentSession(); Criteria crit =
	 * session.createCriteria(misuser.class);
	 * 
	 * ProjectionList projList = Projections.projectionList();
	 * projList.add(Projections.sum("foregroundTime"), "foregroundTime"); //
	 * projList.add(Projections.sum("dataUsed"),"dataUsed");
	 * projList.add(Projections.property("appName"));
	 * 
	 * projList.add(Projections.property("dateTime"));
	 * projList.add(Projections.groupProperty("appId"));
	 * projList.add(Projections.groupProperty("appName"));
	 * projList.add(Projections.groupProperty("dateTime"));
	 * 
	 * crit.setProjection(projList); if (!(partner.equals("0"))) {
	 * crit.add(Restrictions.eq("cpid", Integer.parseInt(partner))); }
	 * System.out.print(dateFrom+"|"+dateTo); crit.add(Restrictions.ge("dateTime",
	 * dateFrom)); crit.add(Restrictions.le("dateTime", dateTo));
	 * 
	 * List<Object> list = new ArrayList<Object>(); list = crit.list();
	 * 
	 * session.flush();
	 * 
	 * return list; }
	 */

	@Override
	public List<Object> getMisDownload(String partner, String month) {
		// TODO Auto-generated method stub
		Date dt = new Date();

		SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String date = df2.format(date1);

		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(AppStoreAPKDownload.class);

		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.rowCount());
		projList.add(Projections.property("appName"));
		projList.add(Projections.property("cpid"));
		projList.add(Projections.property("appId"));

		projList.add(Projections.property("dateTime"));
		projList.add(Projections.groupProperty("appName"));
		projList.add(Projections.groupProperty("cpid"));
		projList.add(Projections.groupProperty("appId"));

		crit.setProjection(projList);
		if (!(partner.equals("0"))) {
			crit.add(Restrictions.eq("cpid", Integer.parseInt(partner)));
			crit.add(Restrictions.eq("statusMessage", "Success"));

		}
		System.out.println(date);
		crit.add(Restrictions.eq("dateTime", date));

		List<Object> list = new ArrayList<Object>();
		list = crit.list();

		session.flush();
		//session.close();
		return list;
	}

	@Override
	public List<Object> getMisData1(String partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = df1.parse(month2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateFrom = df2.format(date1);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateTo = df3.format(date2);

		Session session = sessionFactory.getCurrentSession();
		StringBuffer sbf = new StringBuffer(
				"SELECT sum(forgroundTime),appName,source,appId,cpId,type FROM ReportsAppStats WHERE"
				+ "  date(beginTime)>='"+dateFrom+"' and date(beginTime)<='"+dateTo+"'");

		/*if (type != 0) {*/
		sbf.append("and userId NOT IN (:ids) and id in(select max(id) from ReportsAppStats where type=1 and date(beginTime)>='"+dateFrom+"'\n" + 
				" and date(beginTime)<='"+dateTo+"'  group by userId,appId,date(beginTime))");
		
			sbf.append(" and  type=" + 1);

		/* } */
		if (source != 0) {
			sbf.append(" and source="+source);

		}
		if (!(partner.equals("0"))) {
			sbf.append(" and cpId="+partner);

		}

		

		sbf.append(" GROUP BY cpId");
		//query.set
		Query query = session.createQuery(sbf.toString()).setParameterList("ids", getINumbers());

		List<Object> list = new ArrayList<Object>();

		list = query.list();
		session.flush();
		//session.close();
		return list;
	}
	
	@Override
	public List<Object> getMisData(String partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = df1.parse(month2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateFrom = df2.format(date1);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateTo = df3.format(date2);

		Session session = sessionFactory.getCurrentSession();
		StringBuffer sbf = new StringBuffer(
				"SELECT sum(forgroundTime),appName,source,appId,cpId,type FROM ReportsAppStats WHERE   userId NOT IN (:ids) and  date(beginTime)>='"+dateFrom+"' and date(beginTime)<='"+dateTo+"' ");

		/*if (type != 0) {*/
			sbf.append(" and  type=" + 2);

		/* } */
		if (source != 0) {
			sbf.append(" and source="+source);

		}
		if (!(partner.equals("0"))) {
			sbf.append(" and cpId="+partner);

		}

		

		sbf.append(" GROUP BY appId,source");

		Query query = session.createQuery(sbf.toString()).setParameterList("ids", getINumbers());

		List<Object> list = new ArrayList<Object>();

		list = query.list();
		session.flush();
		//session.close();
		return list;
	}

	@Override
	public List<Object> getMisDataContent(Integer partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = df1.parse(month2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateFrom = df2.format(date1);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateTo = df3.format(date2);

		Session session = sessionFactory.getCurrentSession();
		StringBuffer sbf = new StringBuffer(
				"select Sum(a.forgroundTime),a.appName,b.info,a.type,a.cpId,b.itemtype from ReportsAppStats a,PortLetInfo b WHERE  a.userId  NOT IN (:ids) and a.contentId=b.id and date(a.beginTime)>='"+dateFrom+"' and date(a.beginTime)<='"+dateTo+"'");
		
		/*if (!(partner.equals("0"))) {*/
			sbf.append(" and a.appId="+partner+" and a.source="+source);

		/* } */

		/*
		 * if (source!=0) { sbf.append(" and a.source="+source);
		 * 
		 * }
		 */

		

		sbf.append(" GROUP BY a.contentId");

		Query query = session.createQuery(sbf.toString()).setParameterList("ids", getINumbers());

		List<Object> list = new ArrayList<Object>();

		list = query.list();
		session.flush();
		//session.close();
		return list;
		}

	@Override
	public List<Object> getMisDataContentG(Integer id, String month, String month2, Integer type, int source) {
		// TODO Auto-generated method stub

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = df1.parse(month2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateFrom = df2.format(date1);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateTo = df3.format(date2);

		Session session = sessionFactory.getCurrentSession();
		StringBuffer sbf = new StringBuffer(
				"SELECT sum(forgroundTime),appName,source,appId,cpId,type FROM ReportsAppStats WHERE"
				+ "  date(beginTime)>='"+dateFrom+"' and date(beginTime)<='"+dateTo+"'");

		/*if (type != 0) {*/
		sbf.append("and  userId NOT  IN (:ids) and id in(select max(id) from ReportsAppStats where type=1 and date(beginTime)>='"+dateFrom+"'\n" + 
				"		        and date(beginTime)<='"+dateTo+"'  group by userId,appId,date(beginTime))");
		
			sbf.append(" and  type=" + 1);

		/* } */
		if (source != 0) {
			sbf.append(" and source="+source);

		}
		//if (!(partner.equals("0"))) {
			sbf.append(" and cpId="+id);

		//}

		

		sbf.append(" GROUP BY appId,appName");

		Query query = session.createQuery(sbf.toString()).setParameterList("ids", getINumbers());

		List<Object> list = new ArrayList<Object>();

		list = query.list();
		session.flush();
		//session.close();
		return list;
	}

	@Override
	public List<Object> getMisDataWeb(String partner, String month, String month2, Integer type, Integer source) {
		// TODO Auto-generated method stub

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = df1.parse(month2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateFrom = df2.format(date1);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateTo = df3.format(date2);

		Session session = sessionFactory.getCurrentSession();
		StringBuffer sbf = new StringBuffer(
				"SELECT COUNT(1)*60,b.appName,20,1,b.cpid,1 FROM GamesToken a,PortLetInfo "
				+ "b  where a.msisdn  NOT IN (:nums) and date(a.lastTime)>='"+dateFrom+"' and date(a.lastTime)<='"+dateTo+"' and a.contentId=b.id");;
		
		
		if (!(partner.equals("0"))) {
			sbf.append(" and b.cpid="+partner);

		}

		

		sbf.append(" GROUP BY b.cpid");

		Query query = session.createQuery(sbf.toString()).setParameterList("nums", getWNumbers());

		List<Object> list = new ArrayList<Object>();

		list = query.list();
		session.flush();
		//session.close();
		return list;
	}	
	
	@Override
	public List<Object> getMisDataWebC(Integer id, String month, String month2, Integer type, int source) {
		// TODO Auto-generated method stub

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = null;
		try {
			date1 = df1.parse(month);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date2 = null;
		try {
			date2 = df1.parse(month2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		String dateFrom = df2.format(date1);

		SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateTo = df3.format(date2);

		Session session = sessionFactory.getCurrentSession();
		StringBuffer sbf = new StringBuffer(
				"SELECT COUNT(1)*60,b.appName,20,1,b.cpid,1 FROM GamesToken a,PortLetInfo "
				+ "b  where  a.msisdn  NOT IN (:nums) and date(a.lastTime)>='"+dateFrom+"' and date(a.lastTime)<='"+dateTo+"' and a.contentId=b.id");;
		
		
		

		

		sbf.append(" GROUP BY a.contentId");

		Query query = session.createQuery(sbf.toString()).setParameterList("nums", getWNumbers());

		List<Object> list = new ArrayList<Object>();

		list = query.list();
		session.flush();
		//session.close();
		return list;
	}	
	

}
