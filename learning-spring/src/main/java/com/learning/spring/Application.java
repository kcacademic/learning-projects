package com.learning.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.spring.beanlifecycle.MyBean;
import com.learning.spring.config.SpringConfig;
import com.learning.spring.config.SpringConfigYaml;
import com.learning.spring.spel.CustomerConfig;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.learning.spring");

		MyBean myBean = context.getBean(MyBean.class);
		System.out.println(myBean);

		CustomerConfig customerConfig = context.getBean(CustomerConfig.class);
		System.out.println(customerConfig.getCustomerNames());
		System.out.println(customerConfig.getCustomerAge());

		SpringConfig springConfig = context.getBean(SpringConfig.class);
		System.out.println(springConfig.getValueFromString());
		System.out.println(springConfig.getValuesFromMap());

		SpringConfigYaml springConfigYaml = context.getBean(SpringConfigYaml.class);
		System.out.println(springConfigYaml.getValueFromString());
		System.out.println(springConfigYaml.getValuesFromMap());

		context.close();

	}

}
