package leetcode;
import java.util.*;

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		HashMap<Integer, HashSet<Character>> map =
				new HashMap<Integer, HashSet<Character>>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.') {
					if (!map.get(i).contains(board[i][j])) {
						map.put(i, new HashSet<Character>());
						map.get(i).add(board[i][j]);
					}
						
					else
						return false;
				
					if (!map.get(j+9).contains(board[i][j])) {
						map.put(((Character)(j+9), new HashSet<Character>());
						map.get(j+9).add(board[i][j]);
					}
						
					else
						return false;
					
					if (!map.get(i+3*j+18).contains(board[i][j])) {
						
					}
						map.get(i+3*j+18).add(board[i][j]);
					else
						return false;
				}
			}
		}
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
