package com.coding;

import com.coding.configuartion.AppConfig;
import com.coding.dao.MyDao;
import com.coding.dao.impl.MyDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Classname Test
 * @Description
 * @Date 2020/2/29 17:33
 * @Created by 亢丁
 */
public class Test {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext =
//				new AnnotationConfigApplicationContext(AppConfig.class);

		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new TestBeanFactoryProcessor());
		annotationConfigApplicationContext.register(MyDaoImpl.class);
//		annotationConfigApplicationContext.scan("com.coding");
		annotationConfigApplicationContext.refresh();

		MyDao myDaoImpl = (MyDao)annotationConfigApplicationContext.getBean("myDaoImpl");
//		MyDao myDaoImpl1 = (MyDao)annotationConfigApplicationContext.getBean("myDaoImpl");
//		System.out.println(myDaoImpl.hashCode()+"-------"+myDaoImpl1.hashCode());
//		myDaoImpl.say("你好!!");

		//-----------测试cglib
//		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass(MyDaoImpl.class);
//		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//		enhancer.setCallback(new TestMethodCallback());
//		MyDaoImpl myDao = (MyDaoImpl) enhancer.create();
//		myDao.say("hello cglib");


	}
}
