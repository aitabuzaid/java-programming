package leetcode;
import java.util.*;

public class FirstUniquChar {
	
	public static int firstUniqChar(String s) {
		Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!table.contains(s.charAt(i))) {
				table.put(s.charAt(i), i);
			}
			else {
				table.remove(s.charAt(i));
			}
		}
		char minChar;
		int minInd = (int)Math.pow(2, 31);
		for (Character key : table.keySet()){
			if (table.get(key) < minInd) {
				minChar = key;
				minInd = table.get(key);
			}
				
		}
				
		return minInd;
	}

	static void main(String args[]) {

	}

}
