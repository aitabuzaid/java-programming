package leetcode;

public class ReverseInt {

	public static int reverse(int x) {
		boolean neg = false;
		int res = 0, l;
		if (x < 0) {
			x = -1*x;
			neg = true;
		}
			
		while (x > 0) {
			l = x % 10;
			if (res*10+l < res)
				return 0;
			res = res*10 + l;
			x = x / 10;
		}
		
		if (neg)
			return -res;
		else
			return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 1534236469;//1233410;
		System.out.println(reverse(test));
	}

}
