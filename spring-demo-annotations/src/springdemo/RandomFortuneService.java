package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data= {
			"Hello1","Hello2","Hello3"
	};
	
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
