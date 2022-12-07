package academy.learnprogramming.leetCode;

public class _009palindromeNumber {

    public static void main(String[] args) {
        int num = 1221;
        System.out.println("Is num: " + num + " a palindrome number?: " + isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {
        if(num < 0) { return false; }

        int actualNum = num;
        int revNum = 0;
        int length = Integer.toString(num).length() - 1;
        int index = 1;

//        System.out.println("The length is: " + length);

        while(length >= 0){
//            System.out.println("index: " + index + " length: " + length + " || (Math.pow(10, index)): " + (int)(Math.pow(10, index)) + " || num % (Math.pow(10, index))): " + num % (Math.pow(10, index)));
            revNum += (int)(num % (Math.pow(10, index))) * (int)(Math.pow(10, length));
            num = (int)(num / (Math.pow(10, index)));
//            System.out.println("revNum: " + revNum + " num: " + num);
            length--;
        }

//        System.out.println("actualNum: " + num + " || revNum: " + revNum);
        return actualNum == revNum;
    }
}