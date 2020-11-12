package src;

import java.util.Base64;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class Mycode {
	
	/**
	 * @author Daud Kakumirizi
	 */
	
	static Cipher cipher;
	
	/**
	 * Encrypt a string with AES algorithm.
	 *
	 * @param data is a string
	 * @return the encrypted string
	 */
	static Scanner scanner = new Scanner(System.in);
	
	private void letters() {
		System.out.println("My Programming journey");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Select the operation you want to perform");
		System.out.println("1. Encrpt message");
		System.out.println("2. Decrpt message");
		System.out.println("3. Exit");
		
		int input= scanner.nextInt();
		if(input==1) {
			
			System.out.println("Enter the message to encrypt:");
			String message = scanner.next();
			System.out.println("Entered text: " + message);
			System.out.println("*******************************");
			System.out.println("Enter the key of your choice:");
			
			String key = scanner.next();
			System.out.println("Random Key:" + key);
			
		} else if (input == 2) {
			System.out.println("*****************************");
			System.out.println("Decrypting message:");
			System.out.println("Enter the cipher text: ");
			scanner.next();
			System.out.println("Enter the private key:");
			scanner.next();
			
			String name = null;
			System.out.println("Decrypted message reads: " + name);
		}
		else if (input == 3) {
			System.out.println("GoodBye");
		}
	}
	
	/*
	Cipher Info
	Algorithm : for the encryption of electronic data
	mode of operation : to avoid repeated blocks encrypt to the same values.
	padding: ensuring messages are the proper length necessary for certain ciphers 
	mode/padding are not used with stream cyphers.  
	*/
	public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
		byte[] plainTextByte = plainText.getBytes();
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptedByte = cipher.doFinal(plainTextByte);
		Base64.Encoder encoder = Base64.getEncoder();
		String encryptedText = encoder.encodeToString(encryptedByte);
		return encryptedText;
	}
	
	/* 
	create key 
	If we need to generate a new key use a KeyGenerator
	If we have existing plaintext key use a SecretKeyFactory
	*/
	public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] encryptedTextByte = decoder.decode(encryptedText);
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptedByte = cipher.doFinal(encryptedTextByte);
		String decryptedText = new String(decryptedByte);
		return decryptedText;
	}
	
	

}
