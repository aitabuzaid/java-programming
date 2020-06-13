package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountTriplets {

	// Complete the countTriplets function below.
	static long countTriplets(List<Long> arr, long r) {
		TreeMap<Long, Long> map = new TreeMap<Long, Long>();
		for (int i = 0; i < arr.size(); i++)
		{
			if( isPower(arr.get(i),r))
			{
				if (map.containsKey(arr.get(i)))
					map.put(arr.get(i), map.get(arr.get(i))+1);
				else
					map.put(arr.get(i), (long)1);
			}
		}
		Object[] keyArr = map.keySet().toArray();
		//System.out.println(map);
		if (keyArr.length < 3)
			return 0;
		long temp = 0;
		for (int i = 0; i < keyArr.length-2; i++) {
			if (((long)keyArr[i+1]/(long)keyArr[i] == r) && ((long)keyArr[i+2]/(long)keyArr[i+1] == r))
				temp +=  (map.get(keyArr[i])*map.get(keyArr[i+1])*map.get(keyArr[i+2]));
		}

		return temp;
	}



	public static boolean isPower(long x, long r) {
		if (x == 1) return true;
		if (r == 0) return false;
		if (r == 1) return true;
		if (x%r != 0) return false;
		long temp = x/r;
		while (temp > 1) {
			if (temp%r != 0) return false;
			temp = temp/r;			
		}
		return true;
	}

	public static void main(String[] args) {
		//System.out.println(isPower(27,0));
		List<Long> list = new ArrayList<Long>();
		/*
		list.add((long)1);
		list.add((long)2);
		list.add((long)2);
		list.add((long)4);
		 */
		/*
		list.add((long)1);
		list.add((long)3);
		list.add((long)9);
		list.add((long)9);
		list.add((long)27);
		list.add((long)81);
		 */
		list.add((long)1);
		list.add((long)5);
		list.add((long)5);
		list.add((long)25);
		list.add((long)125);
		//System.out.println(list);
		System.out.println(countTriplets(list,(long)5));

	}
}
