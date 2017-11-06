package LeetProblems;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import sun.awt.image.ImageWatched.Link;

/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

/*
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers_2 {
	
	
	public static void main(String[] args) {
		//ListNode l = new ListNode;
		/*Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int t1 = scanner.nextInt();
		int t2 = scanner.nextInt();
		int b = scanner.nextInt();
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();*/
		ListNode cur1 = new ListNode(0);
		ListNode l1 = cur1;
		l1.next = new ListNode(2);
		l1 = l1.next;
		l1.next = new ListNode(4);
		l1 = l1.next;
		l1.next = new ListNode(3);
		ListNode cur2 = new ListNode(0);
		ListNode l2 = cur2;
		l2.next = new ListNode(5);
		l2 = l2.next;
		l2.next = new ListNode(6);
		l2 = l2.next;
		l2.next = new ListNode(4);
		ListNode l3 = new ListNode(0);
		l3 = addTwoNumbers(cur1.next,cur2.next);
		while(l3!=null){
			System.out.print(l3.val+" ");
			l3 = l3.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode p = l1, q = l2, cur = l3;
		int carry = 0;
		while(p!=null || q!=null){
			 int x = (p != null) ? p.val : 0;
			 int y = (q != null) ? q.val : 0;
			 int sum = carry + x + y;
			 carry = sum / 10;
			 cur.next = new ListNode(sum%10);
			 cur = cur.next;
			 if(p != null) p = p.next;
			 if(q != null) q = q.next;
		}
		if(carry > 0){
			cur.next = new ListNode(carry);
		}
		return l3.next;
	}
	
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode dummyHead = new ListNode(0);
//	    ListNode p = l1, q = l2, curr = dummyHead;
//	    int carry = 0;
//	    while (p != null || q != null) {
//	        int x = (p != null) ? p.val : 0;
//	        int y = (q != null) ? q.val : 0;
//	        int sum = carry + x + y;
//	        carry = sum / 10;
//	        curr.next = new ListNode(sum % 10);
//	        curr = curr.next;
//	        if (p != null) p = p.next;
//	        if (q != null) q = q.next;
//	    }
//	    if (carry > 0) {
//	        curr.next = new ListNode(carry);
//	    }
//	    return dummyHead.next;
//    }
}
