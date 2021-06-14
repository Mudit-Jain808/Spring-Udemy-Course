package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("TennisCoach",Coach.class);
		Coach alphaCoach=context.getBean("textCoach",Coach.class);
		
		//check if they are the same
		boolean result=(theCoach==alphaCoach);
		
		//print the results
		System.out.println("Pointing to same object"+result);
		
		context.close();
	}

}
