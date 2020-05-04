package hackerrank;

public class MinBribes {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q = {3,1,2,4,5,6};
		minBribes(q);

	}

	static void minimumBribes(int[] q) {
		int count = 0;
		int max = q.length-1;
		while(max != 0) {
			int i = max;
			while(q[i] <= i+1)
				i--;
			while(q[i] != i+1){

			}
		}
		System.out.println("Too chaotic");
		System.out.println(count);
	}
}
