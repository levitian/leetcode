package cn.tyy.leetcode;

import cn.tyy.leetcode.bean.ListNode;

import java.util.*;

/**
 * 876. 链表的中间结点
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *<a href="https://leetcode.cn/problems/middle-of-the-linked-list/solution/lian-biao-de-zhong-jian-jie-dian-by-leetcode-solut/">...</a>
 */
public class MiddleooOfTheLinkedList {



    //官方题解 方法一：数组
    public ListNode middleNode1(ListNode head) {
        ListNode[] listNodes = new ListNode[100];
        int pos = 0;
        while (head != null){
            listNodes[pos++] = head;
            head = head.next;
        }
        return listNodes[pos/2];
    }

    //官方题解 方法二：单指针法
    public ListNode middleNode2(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            ++n;
            cur = cur.next;
        }
        int k = 0;
        cur = head;
        while (k < n / 2) {
            ++k;
            cur = cur.next;
        }
        return cur;
    }

    //官方题解 方法三：快慢指针法
    public ListNode middleNode3(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast  != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
