package exazeit.project.SimpleSpring;

import org.apache.commons.configuration.beanutils.BeanFactory;
import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class javaApp 
{
	public static void main(String[] args)
	{
		try
		{
	ApplicationContext fact=new ClassPathXmlApplicationContext("configure.xml");
			
//			BeanFactory fact=(BeanFactory) new ClassPathXmlApplicationContext("configure.xml");
		JavaBean c=new JavaBean();
		JavaBean b=fact.getBean("name1",JavaBean.class);
		JavaBean b1=fact.getBean("name2",JavaBean.class);
		JavaBean b2=fact.getBean("name3",JavaBean.class);
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
