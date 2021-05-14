package leetcode;

public class RotateMatrix {

	public static void rotate(int[][] matrix) {
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
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		printMatrix(matrix);
		rotate(matrix);
		printMatrix(matrix);
	}

}
