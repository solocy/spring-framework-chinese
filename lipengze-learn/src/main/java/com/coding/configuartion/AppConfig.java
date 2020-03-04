package com.coding.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname Application
 * @Description
 * @Date 2020/2/29 17:49
 * @Created by 亢丁
 *
 * 我们这里发现，即使不加 @Configuration 我们的程序依然能够正常执行，那么这个 @Configuration 到底有什么卵用呢？
 * 这个是spring的终极问题：
 * 		这里是Full 和 Lite 的原因。想要理解这个，就要理解 @Configuration
 * 		这个问题请移步 ConfigurationClassPostProcessor 类的 processConfigBeanDefinitions 方法。里面有详细说明
 */
@Configuration
@ComponentScan("com.coding")
public class AppConfig {

	//这里的代码用于测试，这个配置类当是不是全注解时有什么区别。我们来查看myDao1它的构造方法会打印几次。当是全注解类时只会打印一次，否则打印两次
//	@Bean
//	public MyDao myDao1() {
//		return new MyDaoImpl();
//	}
//
//	@Bean
//	public MyDao myDao2() {
//		myDao1();
//		return new MyDaoImpl1();
//	}



}
