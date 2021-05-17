package leetcode;

public class RotateMatrix {

	public static void rotate(int[][] matrix) {
		int temp;
		int size = matrix.length-1;
		for (int k = 0; k < (size+1)/2; k++) {
			for (int l = 0; l < (size)-(2*k); l++) {
				temp = matrix[0+k][l+k];
				matrix[0+k][l+k] = matrix[size-l-k][0+k];
				matrix[size-l-k][0+k] = matrix[size-k][size-l-k];
				matrix[size-k][size-l-k] = matrix[l+k][size-k];
				matrix[l+k][size-k] = temp;
				//for (int m = 0; m < 3; m++) {
				//}
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		//int[][] matrix = {{1,2},{3,4}};
		//int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrix = {{1,2,3,4,5},{5,6,7,8,9},{9,10,11,12,13},{13,14,15,16,17},{17,18,19,20,21}};
		printMatrix(matrix);
		rotate(matrix);
		printMatrix(matrix);
	}

}
