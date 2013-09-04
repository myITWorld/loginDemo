
package com.zoomkey.dao.daoimp;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zoomkey.dao.UserDao;
import com.zoomkey.entity.User;
import com.zoomkey.query.HibernateUtil;
import com.zoomkey.util.DBHelper;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：上午07:39:09
***************************/
public class UserDaoImp extends HibernateDaoSupport implements UserDao {

	@Override
	public ResultSet findUserbyInfo(User user) {
		String sql = "select count(*) from t_user where name_=? and pwd_=?";
		DBHelper dh = new DBHelper();
		ResultSet rs = dh.execQuery(sql, user.getName(), user.getPwd());
		return rs;
	}

	@Override
	public List getUsers() {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		String sql = "from User";
		Query query = session.createQuery(sql);
		List list = query.list();
		tx.commit();
		HibernateUtil.closeSession();
		return list;
	}

	public User getUser(String userId) {
		Session session = HibernateUtil.currentSession();
		User user = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("from User where name=:userId");
			query.setParameter("userId", userId);
			List list = query.list();
			if (!list.isEmpty()) {
				user = (User) list.get(0);
				tx.commit();
			}
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				throw e;
			}
		}
		return user;
	}
}
