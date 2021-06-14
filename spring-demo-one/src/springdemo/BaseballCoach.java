package springdemo;

public class BaseballCoach implements Coach {
public String getDailyWorkout() {
	return "Spend 30 minutes on batting practice";
}

//define a private field for the dependency
	private FortuneService fortuneService;

	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();	
	}
}
