package com.coding.leanrImportAware;

import com.coding.leanrImportAware.anno.TestCodingAnno;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Classname TestImportAware
 * @Description
 * @Date 2020/3/5 0:33
 * @Created by 亢丁
 *
 * 这个 ImportAware 可以好好学学，可以通过注解的方式，拿到注解类中我们指定的值。同时可是做到，动态插拔的作用。
 * 当然我们也可以通过properties或者xml等方式，也可以做到同样的事情
 */
@Component
public class TestImportAware implements ImportAware {
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		Map<String, Object> annotationAttributes = importMetadata.getAnnotationAttributes(TestCodingAnno.class.getName());
		System.out.println(annotationAttributes.get("testKey")+"---------------");
	}
}
