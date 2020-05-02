package hackerrank;

public class MinBribes {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q = {3,1,2,4,5,6};
		minBribes(q);

	}

	static void minBribes(int[] q) {
		int count = 0;
		for (int i = 0; i < q.length; i++) {
			if (q[i] > i+3) {
				System.out.println("Too chaotic");
				return;
			}
			else if (q[i] > i+1)
				count += q[i]-i-1;                
		}
		System.out.println(count);
	}
}
