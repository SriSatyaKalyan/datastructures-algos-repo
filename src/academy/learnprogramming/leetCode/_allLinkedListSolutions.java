package academy.learnprogramming.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _allLinkedListSolutions {
    public static void main(String[] args) {
//        [3,2,2,1,3,2,4]
//        ListNode head = new ListNode(3, new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(2, new ListNode(4, null)))))));
//        deleteDuplicatesUnsorted(head);

//        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode head = new ListNode(2, new ListNode(1, null));
//        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2, null))))));
//        head = removeNthNodeFromEndOfList(head, 2);
//        head = partitionThis(head, 2);

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

//        [9]
//        [1,9,9,9,9,9,9,9,9,9]

//        ListNode l1 = new ListNode(9, null);
//        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))))))))));

//        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));
//        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        head = addTwoNumbers(l1, l2);

        System.out.println("\n-----------------");
        while (head != null) {
            System.out.print(head.val + " || ");
            head = head.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        ListNode l1Parser = l1;
        ListNode l2Parser = l2;

        int l1Length = 0;
        int l2Length = 0;

        ArrayList<Integer> l1Arr = new ArrayList<>();
        while (l1Parser != null) {
            l1Length++;
            l1Arr.add(l1Parser.val);
            l1Parser = l1Parser.next;
        }

        ArrayList<Integer> l2Arr = new ArrayList<>();
        while (l2Parser != null) {
            l2Length++;
            l2Arr.add(l2Parser.val);
            l2Parser = l2Parser.next;
        }

        System.out.println("l1Length: " + l1Length + " ||  l2Length: " + l2Length);

        System.out.println(l1Arr.size() + " ---- " + l2Arr.size());
        for (int i : l1Arr) {
            System.out.print(i + " || ");
        }
        System.out.println();

        for (int i : l2Arr) {
            System.out.print(i + " || ");
        }

        int insert = 0;
        int carry = 0;

        int l1Counter = 0;
        int l2Counter = 0;
        ArrayList<Integer> sum = new ArrayList<>();
        while (l1Counter < l1Length && l2Counter < l2Length) {
            insert = l1Arr.get(l1Counter) + l2Arr.get(l2Counter) + carry;

            if (insert > 9) {
                System.out.println("\nHere insert is: " + insert + " and carry is: " + carry + " Integer.toString(insert).charAt(1) " + Integer.toString(insert).charAt(1));
                carry = 1;
                sum.add(Integer.valueOf((Integer.toString(insert).substring(1))));
            } else {
                System.out.println("\nHere insert is: " + insert + " and carry is: " + carry);
                carry = 0;
                sum.add(Integer.valueOf((Integer.toString(insert))));
            }

            l1Counter++;
            l2Counter++;
        }

        System.out.println("l1Counter: " + l1Counter + " || l2Counter: " + l2Counter + " || carry: " + carry);
        while (l1Counter < l1Length) {
            System.out.println("l1Counter: "+ l1Counter);
            insert = l1Arr.get(l1Counter) + carry;

            if (insert > 9) {
                System.out.println("\nHere insert is: " + insert + " and carry is: " + carry + " Integer.toString(insert).charAt(1) " + Integer.toString(insert).charAt(1));
                carry = 1;
                sum.add(Integer.valueOf((Integer.toString(insert).substring(1))));
            } else {
                System.out.println("\nHere insert is: " + insert + " and carry is: " + carry);
                carry = 0;
                sum.add(Integer.valueOf((Integer.toString(insert))));
            }

            l1Counter++;
        }

        while (l2Counter < l2Length) {
            System.out.println("l2Counter: "+ l2Counter);
            insert = l2Arr.get(l2Counter) + carry;

            if (insert > 9) {
                System.out.println("\nHere insert is: " + insert + " and carry is: " + carry + " Integer.toString(insert).charAt(1) " + Integer.toString(insert).charAt(1));
                carry = 1;
                sum.add(Integer.valueOf((Integer.toString(insert).substring(1))));
            } else {
                System.out.println("\nHere insert is: " + insert + " and carry is: " + carry);
                carry = 0;
                sum.add(Integer.valueOf((Integer.toString(insert))));
            }

            l2Counter++;
        }

        if(carry > 0){
            sum.add(carry);
        }

        for (int i : sum) {
            System.out.print(i + " || ");
        }

        for(int c : sum){
            dummy.next = new ListNode(c);
            dummy = dummy.next;
        }

        return ans.next;
    }

//    ------------------------------------------------------------------------------------------------------------------------
//    ------------------------------------------------------------------------------------------------------------------------

    private static ListNode partitionThis(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode parser = small;
        ListNode equalOrBigger = new ListNode(0);

        while (head != null) {
            if (head.val < x) {
                parser.next = head;
                parser = parser.next;
            } else {
                equalOrBigger.next = head;
                equalOrBigger = equalOrBigger.next;
            }
            head = head.next;
        }


        return head;
    }

    private static ListNode removeNthNodeFromEndOfList(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;

        while (curr != null) {
            length++;
            System.out.print(curr.val + " | ");
            curr = curr.next;
        }

        System.out.println("\nThe length of the list is: " + length + " and n is: " + n);
        System.out.println("\nhead.val: " + head.val);

        if (length == n) {
            System.out.println("Entered the length == n condition");
            return head.next;
        }

        System.out.println("Did not enter the length == n condition");
        int prevNode = length - n;
        System.out.println("prevNode: " + prevNode);
        curr = head;

        while (prevNode > 1) {
            System.out.println("prevNode: " + prevNode + " || curr.val: " + curr.val);
            curr = curr.next;
            prevNode--;
        }

        System.out.println("curr.val: " + curr.val + " || curr.next.val: " + curr.next.val);
        if (curr.next != null) {
            curr.next = curr.next.next;
        } else {
            curr.next = null;
        }

        return head;
    }

    private static ListNode deleteDuplicatesUnsorted(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        while (curr != null) {
            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        curr = dummy;
        while (head != null) {
            if (map.get(head.val) == 1) {
                curr.next = head;
                curr = curr.next;
            }

            head = head.next;
        }

        curr.next = null;
        return dummy.next;
    }

    //  Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
