package leetcode;

public class Atoi {

	public static int myAtoi(String s) {
		int result = 0;
		boolean sign = true;
		for (int i  = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+')
				continue;
			if (s.charAt(i) == '-') {
				sign = false;
				continue;
			}
			if (s.charAt(i) == ' ')
				continue;
			if(!Character.isDigit(s.charAt(i)))
				continue;
			result = 10*result+(int)(s.charAt(i)-'0');
			
		}
		if (sign)
			return result;
		else
			return -result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("  -1232311353"));
	}

}
