package cn.tyy.leetcode.bean;

import lombok.Data;

/**
 *  Definition for singly-linked list.
 */
@Data
public class ListNode {
     int val;
     public static ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     public static void main(String[] args) {
          ListNode node = new ListNode(2);
          ListNode node1 = new ListNode(1, node);
          System.out.println(node1);
     }
}
