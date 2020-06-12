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
				long test = arr.get((int)i)/arr.get((int)i-1);
				if( test == r | test == 1 )
				{
					if (map.containsKey(arr.get((int)i)))
						map.put(arr.get((int)i), map.get(arr.get((int)i))+1);
					else
						map.put(arr.get((int)i), (long)1);
				}
				else
					map.put(arr.get((int)i), (long)0);				
			}
		}
		System.out.println(map);
		return 0;
	}
	
	

	public static void main(String[] args) {
		List<Long> list = new ArrayList<Long>();
		list.add((long)1);
		list.add((long)3);
		list.add((long)3);
		//list.add((long)4);
		list.add((long)9);
		list.add((long)27);
		System.out.println(list);
		System.out.println(countTriplets(list,(long)3));

	}
}
