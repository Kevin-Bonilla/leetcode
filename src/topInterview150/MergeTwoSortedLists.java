package topInterview150;


// //Definition for singly-linked list.
//class ListNode {
//	int val;
//	ListNode next;
//	ListNode() {}
//	ListNode(int val) { this.val = val; }
//	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
 

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        //edge cases
        if(list1 == null && list2 == null){ //both listnodes passed in are empty
            return null;
        }
        else if(list1 == null){ //list1 is null
            return list2;
        }
        else if(list2 == null){ //list2 is null
            return list1;
        }

        ListNode setupNode = new ListNode();
        ListNode currentNode = setupNode;

        while(list1 != null && list2 != null){
            if (list1.val <= list2.val){ //list1 is lesser of two and will be next in new linked list
                currentNode.next = list1;
                list1 = list1.next; //updating list1 value to next
            }
            else if(list1.val > list2.val){ //list2 is lesser of two and will be next in new linked list
                currentNode.next = list2;
                list2 = list2.next; //updating list2 value to next
            } 

            currentNode = currentNode.next; //updating currentNode to next
        }

        //picking up any left overs
        if (list1 != null){
            currentNode.next = list1;
        }
        else if(list2 != null){
            currentNode.next = list2;
        }

        return setupNode.next;
    }
}
