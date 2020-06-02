package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int len = 1; len <= s.length(); len++) {
            for(int i = 0; i < s.length()-len+1; i++) {
                char[] arr = s.substring(i,i+len).toCharArray();
                Arrays.sort(arr);
                String sortedString = new String (arr);
                Integer count = map.get(sortedString);
                
                if (count == null) {
                    map.put(sortedString,1);
                }
                else{
                    map.put(sortedString,count+1);
                }

            }
        }
        int sum = 0, temp = 0;
        for (String str: map.keySet()) {
            temp = map.get(str);
            sum += (int)(temp * (temp-1)/2);
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
