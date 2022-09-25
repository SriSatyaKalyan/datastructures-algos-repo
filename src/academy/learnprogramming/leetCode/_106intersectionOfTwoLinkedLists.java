package academy.learnprogramming.leetCode;

public class _106intersectionOfTwoLinkedLists {

    public static void main(String[] args) {

    }

//  Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }

            if (headA == headB) {
                return headA;
            }

            ListNode firstPointer = headA;
            ListNode firstPointerII = headA;
            ListNode secondPointer = headB;
            ListNode secondPointerII = headB;

            int lengthA = 1;
            int lengthB = 1;

            while (headA.next != null) {
                headA = headA.next;
                lengthA++;
            }

            while (headB.next != null) {
                headB = headB.next;
                lengthB++;
            }

            if (headA != headB) {
                return null;
            }

            boolean isAlongerThanB = false;
            int diffOfLengths = 0;

            if (lengthA > lengthB) {
                isAlongerThanB = true;
                diffOfLengths = (lengthA - lengthB);
            } else {
                diffOfLengths = (lengthB - lengthA);
            }

            if (isAlongerThanB) {
                while (diffOfLengths > 0) {
                    firstPointer = firstPointer.next;
                    diffOfLengths--;
                }
            } else {
                while (diffOfLengths > 0) {
                    secondPointer = secondPointer.next;
                    diffOfLengths--;
                }
            }

            while (secondPointer.next != null) {
                if (firstPointer == secondPointer) {
                    break;
                }
                firstPointer = firstPointer.next;
                secondPointer = secondPointer.next;
            }

            return secondPointer;
        }
    }
}