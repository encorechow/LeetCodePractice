public class Solution {
	public ListNode partition(ListNode head, int x) {
		if (head == null) {
			return null;
		}
		ListNode small_head = new ListNode(0);
		ListNode large_head = new ListNode(0);
		ListNode large_p = large_head;
		ListNode small_p = small_head;

		ListNode temp = head;

		while (temp != null) {
			if (temp.val < x) {
				small_p.next = temp;
				small_p = small_p.next;
			} else {
				large_p.next = temp;
				large_p = large_p.next;
			}
			temp = temp.next;
		}
		large_p.next = null;

		if (small_head.next != null) {
			small_p.next = large_head.next;
			return small_head.next;
		} else {
			return large_head.next;
		}


	}
}