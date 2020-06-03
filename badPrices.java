import java.util.Scanner;
import java.util.ArrayList;
public class badPrices {
	static Scanner sr = new Scanner(System.in);
	public int helper(ArrayList arr) {
		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if ( (int)arr.get(j) < (int)arr.get(i)) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main (String[] args) {
		badPrices obj = new badPrices();
		double len = sr.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for ( int i = 0; i < len; i++) {
			double arrlen = (double)sr.nextInt();
			arr.clear();
			for (int j = 0; j < arrlen; j++) {
				arr.add(sr.nextInt());
			}
			System.out.println(obj.helper(arr));
		}
	}
}