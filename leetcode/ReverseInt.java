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
			if ((neg && res > (Math.pow(2, 31)-l)/10) ||
				(!neg && res > (Math.pow(2, 31)-l-1)/10))
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
		//int test = 1534236469;//1233410;
		int test = 1563847412;
		System.out.println(reverse(test));
	}

}
