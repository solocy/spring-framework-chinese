package com.coding.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Classname TestBeanFactoryProcessor
 * @Description
 * @Date 2020/3/2 19:32
 * @Created by 亢丁
 *
 * 从这里我们看出来，BeanFactoryPostProcessor 最主要的就是可以得到 beanFactory ，
 * 然后从bean工厂中得到我们想要的bd，然后可以给这个bd改变他的属性，比如说是从单例变为多例
 *
 * 这个是在bean new 出来之前执行。此时还没有调用bean的构造方法。一定要和beanPostProcessor进行区别。非常重要！！
 */
@Component
public class TestBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("myDaoImpl");
		annotatedBeanDefinition.setScope("prototype");
	}
}
