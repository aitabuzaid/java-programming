package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
    	HashMap<String,LinkedList<Integer[]>> map = new HashMap<String,LinkedList<Integer[]>>();
    	for(int len = 1; len <= s.length(); len++) {
    		for(int i = 0; i < s.length()-len+1; i++) {
    			
    			LinkedList<Integer[]> list = map.get(s.substring(i,i+len));
    			
    			if (list == null) {
    				list = new LinkedList<Integer[]>();
    			}
    			Integer[] tempArr = {i,i+len-1};
    			list.add(tempArr);
    			map.put(s.substring(i,i+len), list);
    			//System.out.println(s.substring(i,i+len));
    		}
    	}
    	for (String str: map.keySet()) {
    		System.out.println(str);
    		//System.out.println());
    		LinkedList<Integer[]> list = map.get(str);
    		
    		Iterator<Integer[]> iter = list.iterator();
    		while(iter.hasNext()) {
    			Integer[] arr = iter.next();
    			System.out.println(arr[0]+" "+arr[1]);
    		}
    		System.out.println();
    	}
    	
    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
