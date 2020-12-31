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
		for (int i = a.length()-1; i >= 0; i--) {
			res = Integer.parseInt(a.substring(i,i+1))+
					Integer.parseInt(b.substring(i,i+1))+
					car;
			car = res/10;
			res = res%10;
			result.insert(0, res);
		}
		if (car > 0)
			result.insert(0, car);
		return result.toString();
	}
	
	static String sub(String a, String b) {
		return new String();
	}


	public static void main(String[] args) {
		System.out.println(add("9999","9999"));
		
	}


}
