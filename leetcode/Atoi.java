package leetcode;

public class Atoi {

	public static int myAtoi(String s) {
		int result = 0;
		Boolean sign = null;
		int l;
		for (int i  = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				if (sign != null)
					break;
				
				sign = true;
				continue;
			}
				
			if (s.charAt(i) == '-') {
				if (sign != null)
					break;
				
				sign = false;
				continue;
			}
			if (s.charAt(i) == ' ') {
				if (sign != null)
					break;
				else
					continue;
			}
				
			if(!Character.isDigit(s.charAt(i)))
				break;
			
			if (sign == null)
				sign = true;
			
			l = (int)(s.charAt(i)-'0');
			
			if (sign && result > (Math.pow(2, 31)-l-1)/10)
				return (int)(Math.pow(2, 31));
			if (!sign && result > (Math.pow(2, 31)-l)/10)
				return -(int)(Math.pow(2, 31))-1;
			
			result = 10*result+l;
			
		}
		
		if (sign == null)
			sign = true;
		
		if (sign)
			return result;
		else
			return -result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("   0 123"));
	}

}
