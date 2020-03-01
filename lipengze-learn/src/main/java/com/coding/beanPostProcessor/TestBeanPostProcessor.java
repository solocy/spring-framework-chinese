package com.coding.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @Classname TestBeanPostProcessor
 * @Description
 * @Date 2020/3/1 22:33
 * @Created by 亢丁
 * 实现PriorityOrdered接口，这个接口是用来控制bean实例化的顺序的
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
	/**
	 * bean初始化之前执行
	 * @param bean 原始的bean，当然这里我们可以加工这个bean返回出去，那么就IOC里面存的就是加工后的bean了
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("myDaoImpl")) {
			System.out.println("I am customize TestBeanPostProcessor`s postProcessBeforeInitialization");
		}
		/**
		 * 我们这里就可以返回一个代理对象。【AOP】就是这么干的
		 */
		return bean;
	}

	/**
	 * bean初始化之后执行
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("myDaoImpl")) {
			System.out.println("I am customize TestBeanPostProcessor`s postProcessAfterInitialization");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		//这里的值越小，优先级越高
		return 100;
	}
}
