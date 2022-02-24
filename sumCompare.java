import java.util.*;

public class sumCompare implements Comparable<sumCompare>{

	private int num;
	
	public int sumDigits(int n) {
		int r = 0;
		
		while(n > 0) {
			if(n % 10 != 0) {
				r += n % 10;
			}
			n /= 10;
		}
		
		return r;
	}
	
	public sumCompare(int n) {
		num = n;
	}
	
	public int compareTo(sumCompare ex) {
		if(sumDigits(this.num) > sumDigits(ex.num)) return 1;
		if(sumDigits(this.num) < sumDigits(ex.num)) return -1;
		return this.num - ex.num;
	}
	
	public String toString() {
		return Integer.toString(num);
	}
	
	public static void main(String[] args) throws Exception{
		int[] nums = {23, 34, 45, 51, 78, 92,29,87};
		ArrayList<sumCompare> list = new ArrayList<>();
		for(int n : nums) {
			list.add(new sumCompare(n));
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
