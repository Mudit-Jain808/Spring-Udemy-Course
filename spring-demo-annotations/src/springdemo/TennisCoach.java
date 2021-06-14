package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //("thatSillyCoach")//thatSillyCoach is the bean id
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")//("happyFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println("TennisCoach:inside default constructor");
	}
	
	//define setter method
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("TennisCoach:inside setFortuneService()");
		fortuneService=theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
		
	}
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//define init method
	/*@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside doMyStartupStuff()");
	}
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside doMyCleanupStuff");
	}*/

}
