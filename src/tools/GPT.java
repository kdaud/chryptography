package tools;


public class GPT {
	
	public int addition(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	
	public int addit(int b, int g) {
		return b + g;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Google Commiter");
		int red = new GPT().addition(4, 8);
		int resd = new GPT().addit(45, -93);
		System.out.println(red);
		System.out.println(resd);
		
	}
}
