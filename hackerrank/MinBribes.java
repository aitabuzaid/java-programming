package hackerrank;

public class MinBribes {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] q = {3,1,2,4,5,6};
		int[] q = {1,2,5,3,7,8,6,4};
		minimumBribes(q);

	}

    static void minimumBribes(int[] q) {
        int count = 0;
        int temp = -1;
        for (int i = 0; i < q.length; i++) {
            if (q[i] > i+3) {
                System.out.println("Too chaotic");
                return;
            }
            else if (q[i] > i+1)
                count += q[i]-i-1;                
            else if (q[i] <= i+1){
                if (temp > q[i]) count++;
                temp = q[i];
            }
        }
        System.out.println(count);
    }
}
