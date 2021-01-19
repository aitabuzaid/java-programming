package leetcode;

import java.util.*;

class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums1) {
            if (!map.containsKey(i)) 
                map.put(i, 1);
            else
                map.put(i, map.get(i)+1);
        }
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        int[] array = list.stream().mapToInt(i->i).toArray();
        return array;
    }
}