package unit.test;

import java.util.Scanner;

public class MainTest {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		AESencTest obj = new AESencTest();
		System.out.println(obj.encrypt(scanner.nextLine()));
		System.out.println(obj.decrypt("my code"));
		
	}

}
