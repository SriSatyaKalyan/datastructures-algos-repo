//package academy.learnprogramming.leetCode;
//
//public class _002addTwoNumbers {
//
////    public static class ListNode {
////          int val;
////          ListNode next;
////          ListNode() {}
////          ListNode(int val) { this.val = val; }
////          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
////    }
//
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2 - Add Two Numbers, new ListNode(4, new ListNode(3 - Longest Substring Without Repeating Characters, null)));
//        ListNode k1 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
//        addTwoNumbers(l1, k1);
//    }
//
//    public static void addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode lhead = new ListNode(0);
//        ListNode l = lhead;
//        ListNode newPointer = l;
//
//
//        //adding the numbers in individual lists
//        int index = 0;
//        double sfinal = 0;
//
//        while (true) {
//             if (l1 == null) {
//                 l1.val = 0;
//             }
//              if (l2 == null) {
//                  l2.val = 0;
//              }
//
//            System.out.print("l1.val is " + l1.val + " | " + "l2.val is " + l2.val + " | sfinal: " + sfinal + " || ");
//
//            //adding the results of the sums - sfinal
//            sfinal = sfinal + ((l1.val + l2.val) * Math.pow(10, index));
//
//            System.out.println("" + "l1.val is " + l1.val + " | " + "l2.val is " + l2.val + " | sfinal: " + sfinal);
//            index++;
//            l1 = l1.next;
//            l2 = l2.next;
//            if(l1 == null && l2 == null){
//                break;
//            }
//        }
//
//        //Converting the integer to string and extracting values from the string
//        //and inserting them into the list
//        String str = Integer.toString((int)sfinal);
//        System.out.print("The str is " + str + " and the str.length is " + str.length() + " | ");
//        System.out.println(" ");
//
//        for (int k = str.length()-1 - Two Sum; k >= 0; k--){
//            System.out.println("The inserted element is " + str.charAt(k));
//            l.next = new ListNode(Integer.parseInt(String.valueOf(str.charAt(k))));
////            l.next.val = (Integer.parseInt(String.valueOf(str.charAt(k))));
////            l = l.next;
//        }
//        l.next = null;
//
//        System.out.println("------------------------------");
//        while(newPointer != null){
//            System.out.print(newPointer.val + " | ");
//            newPointer = newPointer.next;
//        }
//
////        return lhead.next;
//    }
//
//}
