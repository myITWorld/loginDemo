
package com.zoomkey.query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/***************************
工程名称：loginDemo
作	    者：杨依逵
日          期：2013-4-11
时          间：下午12:34:21
***************************/
public class HibernateUtil {

	@SuppressWarnings("unused")
	private static Log						log		= LogFactory.getLog(HibernateUtil.class);

	private static final SessionFactory	sessionFactory;
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ExceptionInInitializerError();
		}
	}

	@SuppressWarnings("rawtypes")
	public static final ThreadLocal		session	= new ThreadLocal();

	@SuppressWarnings("unchecked")
	public static Session currentSession() throws HibernateException {
		Session s = (Session) session.get();
		if (s == null || !s.isOpen()) {
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}

	// 关闭session对象的方法
	@SuppressWarnings("unchecked")
	public static void closeSession() throws HibernateException {
		Session s = (Session) session.get();
		session.set(null);
		if (s != null) {
			s.close();
		}
	}
}
