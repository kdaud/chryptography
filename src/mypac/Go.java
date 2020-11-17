package mypac;

import java.util.Random;

public class Go {
	
	Random random = new Random();
	
	int age;
	
	protected int myAge() {
	
		age = random.nextInt(18);
		return age;
	}
	

}
