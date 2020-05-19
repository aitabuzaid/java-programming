package hackerrank;
import java.util.*;
import java.util.Map.Entry;

public class RotLeft {

	// Completed the rotate left function


	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int d = 4;
		int[] output = rotLeft(input, d);
		print(output);
	}

	
    static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length]; 
        for (int i = 0; i < a.length; i++) {
            result[i] = a[(i+d)%a.length];
        }
        return result;
    }
    
    static void print(int[] a) {
    	for (int i = 0; i < a.length; i++) {
    		System.out.print(a[i]+" ");
    	}
    	System.out.println();
    }
		
}
