import java.util.Scanner;
import java.util.ArrayList;
public class badPrices {
	static Scanner sr = new Scanner(System.in);
	public Integer helper(ArrayList arr) {
		Integer count = 0;
		for (Integer i = 0; i < arr.size(); i++) {
			for (Integer j = i + 1; j < arr.size(); j++) {
				if ( (Integer)arr.get(j) < (Integer)arr.get(i)) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main (String[] args) {
		badPrices obj = new badPrices();
		Integer len = sr.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for ( int i = 0; i < len; i++) {
			Integer arrlen = sr.nextInt();
			arr.clear();
			for (Integer j = 0; j < arrlen; j++) {
				arr.add(sr.nextInt());
			}
			System.out.println(obj.helper(arr));
		}
	}
}