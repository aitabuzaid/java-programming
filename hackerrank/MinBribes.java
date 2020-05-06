package hackerrank;
import java.util.*;

public class MinBribes {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] q = {3,1,2,4,5,6};
		//int[] q = {1,2,5,3,7,8,6,4};
		//int[] q = {3,4,5,2,1};
		int[] q = {3,4,2,1,7,8,6,5};
		minimumBribes(q);

	}

	static void minimumBribes(int[] q) {
		HashMap<Integer, Integer> dict = new HashMap<Integer,Integer>();
		int count = 0;
		for (int i = 0; i < q.length; i++) {
			dict.put(q[i], 0);
			for (int key :dict.keySet()){
				if (q[i] < key) {
					if (dict.get(key)+1 > 2) {
						System.out.println("Too chaotic");
						return;
					}
					else{
						dict.put(key, dict.get(key)+1);
						count++;
					}
				}
			}
		}
        System.out.println(count);
    }
}
