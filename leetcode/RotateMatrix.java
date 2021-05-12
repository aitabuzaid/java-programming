package leetcode;

public class RotateMatrix {

    public void rotate(int[][] matrix) {
    	int temp;
    	int size = matrix.length-1;
    	for (int k = 0; k < size/2; k++) {
    		for (int l = 0; l < size-(2*k); l++) {
    			temp = matrix[l][l];
    			matrix[l][l] = matrix[size-l][l];
    			matrix[size-l][l] = matrix[size-l][size-l];
    			matrix[size-l][size-l] = matrix[l][size-l];
    			matrix[l][size-l] = temp;
    			//for (int m = 0; m < 3; m++) {
    			//}
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
