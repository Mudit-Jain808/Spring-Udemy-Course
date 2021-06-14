package springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling";
	}
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	//for setter injection
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method-emailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter method-team");
		this.team = team;
	}
	}
