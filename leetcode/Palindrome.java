package leetcode;

public class Palindrome {

	public boolean isPalindrome(String s) {
		int i = 0, j = s.length()-1;
		
		while (i < j) {
			while (s.charAt(j) < 'a' || s.charAt(j) > 'z') {
				j--;
			}
			while (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
				i++;
			}
			if (i < j && s.charAt(i) != t.charAt(j))
				return false;

				
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
