import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        int totalPrice = 0;
        
        for(int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length - 1; j++) {
                if (prices[j] > prices[j+1]) {
                    swap(prices, j, j+1);
                }
            }
        }
        
        for (int i = 0; i < prices.length; i++) {
            if (totalPrice+prices[i] < k) {
                totalPrice += prices[i];
                count = i+1;
            }
            else break;
        }
        return count;
    }
    
    private static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
    private static void quickSort(int[] arr) {
    	quickSort(arr, 0, arr.length);
    }
    
    private static void quickSort(int[] arr, int min, int max) {
    	int k = (min + max) / 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
