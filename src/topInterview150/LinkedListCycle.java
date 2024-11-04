package topInterview150;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean cycle = false;

        // two pointer method
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null){ // edge case for head alone in linked list or no node
            return false;
        }

        while(fast != null && fast.next != null){
            slow = slow.next; // slow moves one step
            fast = fast.next.next; // fast moves two steps

            if (slow == fast){ //cycle detected
                return true;
            }
        }

        return cycle;
    }
}
