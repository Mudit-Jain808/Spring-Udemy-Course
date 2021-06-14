package springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Swim 1000m as a warmup";
	}
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
