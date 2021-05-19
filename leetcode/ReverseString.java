package leetcode;

public class ReverseString {
	public static void reverseString(char[] s) {
		char temp;
		for (int i = 0; i < s.length; i++) {
			if (i >= s.length-i-1)
				break;
			temp = s[i];
			s[i] = s[s.length-i-1];
			s[s.length-i-1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] string = "Hello".toCharArray();
		char[] string = "Hi".toCharArray();
		System.out.println(string);
		reverseString(string);
		System.out.println(string);

	}

}
