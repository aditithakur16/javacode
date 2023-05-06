 class AddTwoArray {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(0);
        ListNode result = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedList.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                mergedList.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }

        if (list1 != null) {
            mergedList.next = list1;
        } else {
            mergedList.next = list2;
        }

        return result.next;
    }
}
}
