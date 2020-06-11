package com.atpsc.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build())
					.buildMetadata().buildSessionFactory();
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

	public static void closeSessionfactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
			sessionFactory = null;

		}
	}

}
