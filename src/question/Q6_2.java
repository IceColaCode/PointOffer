package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q6_2 {

	public static void main(String[] args) {
	
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(3);
		ln.next.next.next = new ListNode(4);
		ln.next.next.next.next = new ListNode(5);
		ln.next.next.next.next.next = new ListNode(6);
		ln.next.next.next.next.next.next = new ListNode(7);
		reversePrint(ln);
	}
	public static void reversePrint(ListNode node) {
		if(node!=null) {
			if(node.next!=null) {
				reversePrint(node.next);
			}
			System.out.println(node.val);
		}
	}
}
