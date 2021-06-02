package leetcode;

public class CountAndSay {

	public static String countAndSay(int n) {

		if (n == 1)
			return "1";

		String prev = "1";
		String res = "";

		for (int j = 2; j <= n; j++){
			int count = 1;
			res = "";

			int i;
			for (i = 0; i < prev.length(); i++){
				if (i == 0)
					continue;

				else if (prev.charAt(i) == prev.charAt(i-1)){
					count++;
				}
				else{
					res = res.concat(String.valueOf(count)).concat(Character.toString(prev.charAt(i-1)));
					count = 1;
				}

			}

			res = res.concat(String.valueOf(count)).concat(Character.toString(prev.charAt(i-1)));
			prev = res;
		}



		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(10));
	}

}
