package com.DataBase.HibernateApplication;

import java.lang.module.Configuration;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.cfg.annotations.*;
import org.hibernate.cfg.Configuration;

public class ClientApplication
{

	public static void main(String args[])
	{
		JavaBean jb=new JavaBean();
		jb.setCountry("Australia");
		jb.setCity("Sydney");
		
		Configuration c=new Configuration().configure().addAnnotatedClass(JavaBean.class);
		
		ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c.getProperties()).buildServiceRegistry();
		
		SessionFactory sf=c.buildSessionFactory(sr);
		
		Session s=sf.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(jb);
		
		tx.commit();
		
	}

}
