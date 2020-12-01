package com.lhy.lc;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 5200 👎 0

/**
 * @author HASEE lc02
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        listNode1.val =2;
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode();
        listNode2.val =5;
        listNode2.next = new ListNode(6);

        Solution solution = new AddTwoNumbers().new Solution();
        ListNode listNode = solution.addTwoNumbers(listNode1, listNode2);
        while (listNode.next != null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }
        System.out.println(listNode.val);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode result = new ListNode();
            head.next = result;
            int carry = 0;

            while (l1 != null || l2 != null) {
                ListNode currentNode = new ListNode();
                if (l1 == null && l2 != null) {
                    //第二个不空
                    int num =  l2.val;
                    if (carry>0){
                        num++;
                        carry = 0;
                    }
                    if (num == 10 ){
                        carry=1;
                    }
                    currentNode.val = num%10;
                    result.next = currentNode;
                    result = result.next;
                    l2 = l2.next;
                }else if (l1 != null && l2 == null){
                    //第一个不空
                    int num =  l1.val;
                    if (carry>0){
                        num++;
                        carry = 0;
                    }
                    if (num == 10 ){
                        carry=1;
                    }
                    currentNode.val = num%10;
                    result.next = currentNode;
                    result = result.next;
                    l1 = l1.next;

                }else {
                    //两个都不空
                    int num = l1.val + l2.val;
                    int unit = num%10;

                    if (carry>0){
                        unit++;
                        carry = 0;
                    }
                    if (unit==10){
                        carry = 1;
                    }

                    currentNode.val = unit%10;
                    result.next = currentNode;
                    result = result.next;

                    if (num>9) {
                        carry=1;
                    }

                    l1 = l1.next;
                    l2 = l2.next;
                }
            }
            if (carry == 1) {
                result.next = new ListNode(1);
            }
            return head.next.next;
        }
    }

     public static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
 }
//leetcode submit region end(Prohibit modification and deletion)

}