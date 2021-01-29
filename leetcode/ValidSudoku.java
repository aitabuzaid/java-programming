package leetcode;
import java.util.*;

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		HashMap<Integer, HashSet<Character>> map =
				new HashMap<Integer, HashSet<Character>>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.') {
					if (!map.containsKey(i)){
                        map.put(i, new HashSet<Character>());
                        map.get(i).add(board[i][j]);
                    }
					else if (!map.get(i).contains(board[i][j]))
						map.get(i).add(board[i][j]);
					else
						return false;
				
					if (!map.containsKey(j+9)){
                        map.put(j+9, new HashSet<Character>());
                        map.get(j+9).add(board[i][j]);
                    }
					else if (!map.get(j+9).contains(board[i][j])) 
						map.get(j+9).add(board[i][j]);
					else
						return false;
						
					if (!map.containsKey(i/3+3*(j/3)+18)){
                        map.put(i/3+3*(j/3)+18, new HashSet<Character>());
                        map.get(i/3+3*(j/3)+18).add(board[i][j]);
                    }
                    else if (!map.get(i/3+3*(j/3)+18).contains(board[i][j])) 
						map.get(i/3+3*(j/3)+18).add(board[i][j]);
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
