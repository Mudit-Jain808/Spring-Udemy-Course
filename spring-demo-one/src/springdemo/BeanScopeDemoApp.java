package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		
	}

}
