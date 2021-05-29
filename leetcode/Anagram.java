package leetcode;
import java.util.HashMap;

public class Anagram {

	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> sHash = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tHash = new HashMap<Character, Integer>();
		
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			sHash.put(c, sHash.getOrDefault(c, 0)+1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			tHash.put(c, tHash.getOrDefault(c, 0)+1);
		}
		
		for (char key : sHash.keySet()) {
			if (!tHash.containsKey(key))
				return false;
			if (sHash.get(key) != tHash.get(key))
				return false;
			tHash.remove(key);
		}
		
		if (!tHash.isEmpty())
			return false;
		
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hi");
	}

}
