import java.util.Scanner;
public class longWords {
	static Scanner sr = new Scanner(System.in);
	public String tester (String str) {
		int len = str.length();
		String result = "";
		if (len <= 10) 
			result = str;
		else {
			result = result + str.charAt(0) + Integer.toString(len - 2) + str.charAt(len - 1);
		}
		return result;
	}
	public static void main (String[] args) {
		longWords obj = new longWords();
		double length = sr.nextInt();
		String in = null;
		for (int i = 0; i <= length; i++) {
			in = sr.nextLine();
			System.out.println(obj.tester(in));
		}
	}
}