package com.service.dao.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author chouhan_r
 * 
 */
public class HibernateUtil {
	private static final SessionFactory objSessionFactory = buildSessionFactory();

	/**
	 * @author chouhan_r
	 * @date Mar 3, 2014
	 * @description buildSessionFactory
	 * @return
	 */
	public static SessionFactory buildSessionFactory() {
		Configuration config = new Configuration();
		return config.configure("\\xmlconfig\\hibernate_cfg.xml")
				.buildSessionFactory();
	}

	/**
	 * @author chouhan_r
	 * @date Mar 3, 2014
	 * @description getSession
	 * @return
	 */
	public static SessionFactory getSessionFactory() {
		return objSessionFactory;
	}

}
