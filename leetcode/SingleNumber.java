package leetcode;
import java.util.*;

class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();
        for (int i : nums) {
            if (map.contains(i))
                map.remove(i);
            else
                map.add(i);
        }
    return map.iterator().next();
    }
    
}