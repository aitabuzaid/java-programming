package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class MinBribes {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] q = {3,1,2,4,5,6};
		//int[] q = {1,2,5,3,7,8,6,4};
		//int[] q = {3,4,5,2,1};
		int[] q = {3,4,2,1,7,8,6,5};
		//int[] q = {5,1,2,3,7,8,6,4};
		minimumBribes(q);

	}

	
	static void minimumBribes(int[] q) {
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int count = 0;
		int k;
		Entry<Integer, Integer> entry;
		for (int i = 0; i < q.length; i++) {
			k = q[i];
			//System.out.println("\n k: "+k);
			map.put(k, 0);
			while(map.higherEntry(k) != null){
				
				entry = map.higherEntry(k);
				//System.out.println("key: "+entry.getKey());
				//System.out.println("val: "+entry.getValue());
				if (entry.getValue()+1 > 2) {
					System.out.println("Too chaotic");
					return;
				}
				k = entry.getKey();
				map.put(k, entry.getValue()+1);
				count++;
				
			}
		}
		System.out.println(count);
	}
		
}
