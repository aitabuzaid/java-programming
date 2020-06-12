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
		for (long i = 0; i < arr.size(); i++)
		{
			if (i == 0)
				map.put(arr.get((int)i), (long)1);
			else
			{
				if( isPower(arr.get((int)i),r))
				{
					if (map.containsKey(arr.get((int)i)))
						map.put(arr.get((int)i), map.get(arr.get((int)i))+1);
					else
						map.put(arr.get((int)i), (long)1);
				}
				//else
				//	map.put(arr.get((int)i), (long)0);				
			}
		}
		Object[] keyArr = map.keySet().toArray();
		//System.out.println(map);
		long temp = 0;
		for (int i = 0; i < keyArr.length-2; i++)
		{
			temp +=  (map.get(keyArr[i])*map.get(keyArr[i+1])*map.get(keyArr[i+2]));
			//System.out.println(map.get(keyArr[i]));
		}
			
		return temp;
	}
	
	
	
	public static boolean isPower(long x, long r) {
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
