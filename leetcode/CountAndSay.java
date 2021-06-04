package leetcode;
import java.util.*;

public class CountAndSay {

	public static String countAndSay(int n) {

		if (n == 1)
			return "1";

		String prev = "1";
		StringBuilder res = null;
		
		//String res = "";

		for (int j = 2; j <= n; j++){
			int count = 1;
			res = new StringBuilder();

			int i;
			for (i = 0; i < prev.length(); i++){
				if (i == 0)
					continue;

				else if (prev.charAt(i) == prev.charAt(i-1)){
					count++;
				}
				else{
					res = res.append(count).append(prev.charAt(i-1));
					count = 1;
				}

			}

			res = res.append(count).append(prev.charAt(i-1));
			prev = res.toString();
		}



		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(10));
	}

}
