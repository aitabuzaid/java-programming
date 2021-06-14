package leetcode;
import java.util.*;

public class HasCycle {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode cur = head;
        while (cur != null){
            if(set.contains(cur))
                return true;
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
