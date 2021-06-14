package springdemo;

//import javax.annotation.PostConstruct;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleScopeDemoApp2 {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanlifecycle-applicationContext2.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		
		
		
		context.close();
		
	}

}
