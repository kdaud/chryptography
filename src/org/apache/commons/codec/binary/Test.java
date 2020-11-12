package org.apache.commons.codec.binary;

import java.util.Scanner;

public class Test {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		AESenc obj = new AESenc();
		System.out.println(obj.encrypt(scanner.nextLine()));
		System.out.println(obj.decrypt("my code"));
		
	}

}
