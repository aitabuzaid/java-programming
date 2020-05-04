package hackerrank;

public class MinBribes {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q = {3,1,2,4,5,6};
		minimumBribes(q);

	}

	static void minimumBribes(int[] q) {
		int count = 0;
		int max = q.length-1;
		int temp;
		int moves;
		int i;
		while(max >= 0) {
			i = max;
			while((i > 0) && (q[i] <= i+1))
				i--;
			moves = 0;
			while((i <= max) && (q[i] != i+1)){
				if (moves == 2) {
					System.out.println("Too chaotic");
					return;
				}
				temp = q[i+1];
				q[i+1] = q[i];
				q[i] = temp;
				count++;
				i++;
				moves++;
			}
			if (q[i] == i+1) max = i-1;

		}

		System.out.println(count);
	}
}
