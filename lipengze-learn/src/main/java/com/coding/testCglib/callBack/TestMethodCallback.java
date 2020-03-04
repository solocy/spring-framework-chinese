package com.coding.testCglib.callBack;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname TestMethodCallback
 * @Description
 * @Date 2020/3/3 17:09
 * @Created by 亢丁
 *
 * cglib中的方法拦截。
 * 测试成功，成功拦截，并执行了这里的方法
 */
public class TestMethodCallback implements MethodInterceptor {
	/**
	 *
	 * @param o 			代理对象-也就是子类
	 * @param method		目标对象方法
	 * @param objects		参数
	 * @param methodProxy	代理对象方法
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("I am CGLIB MethodCallback...");
		return methodProxy.invokeSuper(o, objects);
	}
}
