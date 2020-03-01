package com.coding.dao.impl;

import com.coding.dao.MyDao;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Classname MyDaoImpl
 * @Description
 * @Date 2020/2/29 17:51
 * @Created by 亢丁
 */
@Component
public class MyDaoImpl implements MyDao {
	/**
	 * 先执行构造这个
	 */
	public MyDaoImpl() {
		System.out.println("I am MyDaoImpl`s construst method");
	}

	/**
	 * 再执行初始化方法
	 */
	@PostConstruct
	public void init() {
		System.out.println("I am MyDaoImpl`s init method");
	}

	/**
	 * 最后执行对象自己的方法
	 * @param word
	 */
	@Override
	public void say(String word) {
		System.out.println(word);
	}
}
