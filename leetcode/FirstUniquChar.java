package leetcode;
import java.util.*;

public class FirstUniquChar {
	
	
	public static int firstUniqChar(String s) {
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!table.containsKey(s.charAt(i))) {
				table.put(s.charAt(i), i);
			}
			else {
				table.replace(s.charAt(i), -1);
			}
		}

		int minInd = (int)Math.pow(2, 31);
		int ind;
		for (Character key : table.keySet()){
			ind = table.get(key);
			if (ind < minInd && ind != -1) {
				minInd = ind;
			}
				
		}
		
		if (minInd == (int)Math.pow(2, 31))
			return -1;
				
		return minInd;
	}
	
	public static void main(String args[]) {
		String str = "loveleetcode";
		System.out.println(firstUniqChar(str));
	}
	

}
