package leetcode;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int i = 0, j = s.length()-1;
		
		while (i < j) {
			while ((j >= 0) && 
					!((s.charAt(j) >= 'a' && s.charAt(j) <= 'z' ) || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
				j--;
			}
			while ((i < s.length()) &&
					!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ) || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) {
				i++;
			}
			if (i < j && s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
				
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		//System.out.println(isPalindrome("P"));
		
	}
	

}
