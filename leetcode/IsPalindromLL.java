package leetcode;

public class IsPalindromLL {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static boolean isPalindrome(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while (cur != null){
            n++;
            cur = cur.next;
        }
        
        if(n <= 1)
            return true;
        
        ListNode prev = null, mid = null;
        cur = head;
        int count = 0;
        while (count < n/2){
            prev = cur;
            cur = cur.next;
            count++;
        }
        mid = prev;
        while(cur != null){
            mid.next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = mid.next;            
        }
        mid.next = null;
        cur = head;
        while (prev != null && cur != null){
            if (prev.val != cur.val)
                return false;
            prev = prev.next;
            cur = cur.next;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
