package leetcode;


public class MergeTwoLists {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode c1 = l1, c2 = l2, c1Prev = null, temp;
		while (c1 != null && c2 != null) {
			if (c1.val <= c2.val) {
				c1Prev = c1;
				c1 = c1.next;
			}
			else {
				if (c1Prev != null) {
					c1Prev.next = c2;
				}
				else {
					l1 = c2;
				}
					
				temp = c2.next;
				c2.next = c1;
				c2 = temp;				
			}
		}
		if (c2 != null)
			c1Prev.next = c2;
		return l1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
