class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        while (list1 != null) {
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }

        while (list2 != null) {
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
/*
* java同时遍历两个链表的双指针实现，
* 同时遍历两个链表，在遍历的同时进行比较操作，
* 输出一个新的链表，而不在原始的两个链表上做修改
* 新链表的创建，通过创建一个新的虚拟头节点，dummy head
* 然后遍历直至一个链表遍历完成，
* 然后把另一个链表的剩余部分直接全部加入到新链表里
* 时间复杂度来到O（m+n）
* */