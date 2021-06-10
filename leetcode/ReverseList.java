package leetcode;


public class ReverseList {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static ListNode reverseList(ListNode head) {
        
        if (head == null)
            return head;
		
		ListNode p1, p2;
		p1 = head;
		p2 = head.next;
                
		
		while (p2 != null) {
			head.next = p2.next;
			p2.next = p1;
			
			p1 = p2;
			p2 = head.next;
		}
		head.next = null;
		head = p1;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
