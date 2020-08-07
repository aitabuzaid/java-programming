package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sherlock {

	// Complete the isValid function below.
	static String isValid(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 1);
			else
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}

		Integer val = null;
		boolean flag = false;
		int counter = 0;
		for (char ch: map.keySet()) {
			//System.out.println(ch);
			//System.out.println(map.get(ch));
			counter++;
			if(val == null)
				val = map.get(ch);

			if (val == map.get(ch))
				continue;
			else if (!flag && (val == map.get(ch)-1)) {
				flag = true;
				continue;
			}
			else if (!flag && (map.get(ch) == val-1) && (counter < 3)) {
				flag = true;
				val = map.get(ch);
				continue;
			}
			else if (!flag && (map.get(ch) == 1)) {
				flag = true;
				continue;
			}
			else
				return "NO";
		}        		

		return "YES";

	}


	public static void main(String[] args){
		//System.out.println(isValid("abcdfghhgfeeedcba"));
		System.out.println(isValid("aaabcde"));

	}
}

