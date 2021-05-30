package leetcode;
import java.util.*;

public class Alive {

	public static int alive(int[][] array) {
		Arrays.sort(array, Comparator.comparingInt(o -> o[0]));
		int max = -1;
		int count = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (pq.peek() != null && pq.peek() < array[i][0]) {
				pq.remove();
				count--;
			}
			count++;
			if (count > max)
				max = count;
			pq.add(array[i][1]);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {{1970,2020},
				{1990,2010},
				{1990,2009},
				{1998,2002},
				{1960,1969},
				{1995,1999}};
		System.out.println(alive(array));
	}
}


