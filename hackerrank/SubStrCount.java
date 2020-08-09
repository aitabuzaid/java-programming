package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SubStrCount {

	// Complete the substrCount function below.
	static long substrCount(int n, String s) {
		long count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				if (isValid(s.substring(j, j+i-1)))
					count++;
			}
			
		}
		return count;
	}
	
	static boolean isValid(String s) {
		return false;
	}


	public static void main(String[] args) {
		System.out.println(substrCount(7,"abcbaba"));
	}

}
