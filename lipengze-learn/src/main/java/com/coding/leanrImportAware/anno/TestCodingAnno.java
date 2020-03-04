package com.coding.leanrImportAware.anno;

import com.coding.leanrImportAware.TestImportAware;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Classname TestCodingAnno
 * @Description
 * @Date 2020/3/5 0:33
 * @Created by 亢丁
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(TestImportAware.class)
public @interface TestCodingAnno {
	String testKey() default "root";
}
