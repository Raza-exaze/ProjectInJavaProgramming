package com.DataBase.HibernatePersistence;

import java.lang.module.Configuration;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;

public class ClientApp 
{
	private static final SessionFactory SessionFactory = null;

	public static void main(String args[])
	{
		JavaBean jb=new JavaBean();
		jb.setCountry("Australia");
		jb.setCity("Sydney");
		
		Configuration c=new Configuration().configure().addAnnotatedClass(JavaBean.class);
		
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf=c.buildSessionFactory(sr);
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(jb);
		
		tx.commit();
		
	}

}
