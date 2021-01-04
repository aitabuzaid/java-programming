package hackerrank;

import java.io.*;
import java.util.*;

class Multiplication {
	static String mult(String x, String y) {
		
		//if (x.length() == 1 || y.length() == 1) {
			//(int)x*(int)y;
		//}
		String a = x.substring(0, x.length()/2);
		String b = x.substring(x.length()/2+1, x.length());
		String c = y.substring(0, y.length()/2);
		String d = y.substring(y.length()/2+1, y.length());
		String ac = mult(a, c);
		String bd = mult(b, d);
		String ab_cd = mult(add(a, b), add(c, d));
		String ad_bc = sub(ab_cd, add(ac, bd));
		//String result 
		return new String();
	}
	
	static String add(String a, String b) {
		StringBuilder result = new StringBuilder();

		int car = 0;
		int res;
		int i = a.length()-1;
		int j = b.length()-1;
		
		while (i >= 0 && j >= 0) {
			res = Integer.parseInt(a.substring(i,i+1))+
					Integer.parseInt(b.substring(j,j+1))+
					car;
			car = res/10;
			res = res%10;
			result.insert(0, res);
			i--;
			j--;
		}
		while (i >= 0) {
			res = Integer.parseInt(a.substring(i,i+1))+car;
			car = res/10;
			res = res%10;
			result.insert(0, res);
			i--;
		}
		while (j >= 0) {
			res = Integer.parseInt(b.substring(j,j+1))+car;
			car = res/10;
			res = res%10;
			result.insert(0, res);
			j--;
		}

		if (car > 0)
			result.insert(0, car);
		return result.toString();
	}
	
	static String sub(String a, String b) {
		StringBuilder result = new StringBuilder();

		int car = 0;
		int res;
		int i = a.length()-1;
		int j = b.length()-1;
		int aInt, bInt;
		while (i >= 0 && j >= 0) {
			aInt = Integer.parseInt(a.substring(i,i+1));
			bInt = Integer.parseInt(b.substring(j,j+1));
			if (aInt-car < bInt) {
				res = 10+aInt-car-bInt;
				car = 1;
			}
			else {
				res = aInt-bInt-car;
				car = 0;
			}
			result.insert(0, res);
			i--;
			j--;
		}
		
		while (i >= 0) {
			res = Integer.parseInt(a.substring(i,i+1))-car;
			car = 0;
			result.insert(0, res);
			i--;
		}
		
		int countZero = 0;
		i = 0;
		while (Integer.parseInt(result.substring(i,i+1)) == 0) {
			countZero++;
			i++;
		}
		
		return result.toString().substring(i);
	}


	public static void main(String[] args) {
		//System.out.println(add("7123","12345"));
		System.out.println(sub("72123","12345"));
		System.out.println(add("59778","12345"));
		
		System.out.println(sub("99245","123"));
		System.out.println(add("99122","123"));
		
		System.out.println(sub("100","40"));
		System.out.println(add("60","40"));
		
		System.out.println(sub("1000","960"));
		System.out.println(add("960","40"));
		
	}


}
