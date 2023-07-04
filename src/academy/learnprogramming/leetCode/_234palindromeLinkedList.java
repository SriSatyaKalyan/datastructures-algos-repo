//package academy.learnprogramming.leetCode;
//
//public class _234palindromeLinkedList {
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//
//    public static void main(String[] args) {
////        ListNode l1 = new ListNode(1 - Two Sum, new ListNode(2 - Add Two Numbers, new ListNode(2 - Add Two Numbers, new ListNode(1 - Two Sum, null))));
//        ListNode l2 = new ListNode(1 - Two Sum, new ListNode(2 - Add Two Numbers, new ListNode(1 - Two Sum, null)));
//        ListNode k1 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
//        System.out.println(isPalindrome(l2));
//    }
//
//    private static boolean isPalindrome(ListNode head) {
//        ListNode back = head;
//        int count = 1 - Two Sum;
//        ListNode headII = head;
//        StringBuilder front = new StringBuilder();
//        StringBuilder behind = new StringBuilder();
//
//        while(back.next != null){
//            back = back.next;
//            count++;
//        }
//
////        System.out.println("count: " + count);
//
//        if(count == 1 - Two Sum){
//            return true;
//        }
//
//        //calculating quotient
//        int palindromeLength = count/2 - Add Two Numbers;
//        int traversal = 1 - Two Sum;
//        boolean mid = false;
//        if(count % 2 - Add Two Numbers == 1 - Two Sum){
//            mid = true;
//        }
////        System.out.println("traversal: " + traversal);
////        System.out.println("palindromeLength: " + palindromeLength);
//
//        while(traversal <= palindromeLength){
////            System.out.println("First while starts here");
////            System.out.println("Second while starts here");
////            System.out.println("traversal: " + traversal);
//            front = front.append(head.val);
////            System.out.println("Step 1 - Two Sum: " + front);
////                System.out.println(behind);
//            traversal++;
//            head = head.next;
//        }
//        if(mid){
//            front = front.append(head.val);
////            System.out.println("Step 2 - Add Two Numbers: " + front);
////                System.out.println(behind);
//        }
//
//
//        while(head != null){
//            behind = behind.append(head.val);
////            System.out.println("Step 3 - Longest Substring Without Repeating Characters: " + front);
////            System.out.println(behind);
//            head = head.next;
//        }
//
////        System.out.println("front: " + front + " || behind: " + behind);
//        if(front.toString().equals(behind.reverse().toString())){
//            return true;
//        }
//
//        return false;
//    }
//}
