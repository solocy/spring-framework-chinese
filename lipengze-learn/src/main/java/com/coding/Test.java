package com.coding;

import com.coding.configuartion.AppConfig;
import com.coding.dao.MyDao;
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
//		annotationConfigApplicationContext.register(MyDaoImpl.class);
		annotationConfigApplicationContext.refresh();

		MyDao myDaoImpl = (MyDao)annotationConfigApplicationContext.getBean("myDaoImpl");
		myDaoImpl.say("你好!!");
	}
}
