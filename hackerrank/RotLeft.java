package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class RotLeft {

	// Complete the minimumBribes function below.


	public static void main(String[] args) {

	}

	
    static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length]; 
        for (int i = 0; i < a.length; i++) {
            result[i] = a[(i+d)%a.length];
        }
        return result;
    }
		
}
