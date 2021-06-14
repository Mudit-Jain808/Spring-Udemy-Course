package springdemo;

public class TrackCoach implements Coach {
public TrackCoach() {}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run hard";
	}
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartUpStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanUpStuff");
	}

}
