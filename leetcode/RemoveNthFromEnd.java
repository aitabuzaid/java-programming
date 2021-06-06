package leetcode;

public class RemoveNthFromEnd {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curNode1 = head, curNode2 = head;
		int count = 0;
        while (curNode1.next != null) {
        	curNode1 = curNode1.next;
        	count++;
        	if (count > n) {
        		curNode2 = curNode2.next;
        	}
        }
        
        if (count == 0){
            head = null;
        }
        else if (n == 1) {
        	curNode2.next = null;
        }
        else if (n-count != 1) {
        	curNode2 = curNode2.next;
        	curNode2.val = curNode2.next.val;
    		curNode2.next = curNode2.next.next;
        }
        else{
            curNode2.val = curNode2.next.val;
    		curNode2.next = curNode2.next.next;
        }
		
		return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
