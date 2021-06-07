package leetcode;


public class ReverseList {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static ListNode reverseList(ListNode head) {
		ListNode p1, p2, p3;
		p1 = head;
		p2 = head.next;
		p3 = head.next.next;
		
		while (p3 != null) {
			p2.next = p1;
			p1 = p2;
			p2 = p3;
			p3 = p3.next;
		}
		p2.next = p1;
		head = p2;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
