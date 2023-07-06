package academy.learnprogramming.leetCode;

import java.util.Stack;

public class _071simplifyPath {

    public static void main(String[] args) {
        String path = "/home//../../foo//..";
        System.out.println("The simplified path is: " + simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder finalpath = new StringBuilder();;

        int pOne = 0;

        for(int i = 1; i < path.length(); i++){
//            System.out.println(pOne + " || " + i);
            if(path.charAt(i) == '/'){
//                System.out.println("Entered the if condition");
//                System.out.println("i - pOne = " + (i - pOne));
                if(i - pOne > 1){
//                    System.out.println("Entered the (i - pOne) condition");
//                    System.out.println("The sequence here is: " + (String)path.subSequence(pOne + 1 - Two Sum, i));
                    if(((String)path.subSequence(pOne + 1, i)).equals("..")){
                        if(!stack.isEmpty()) stack.pop();
                    }else if(!((String)path.subSequence(pOne + 1, i)).equals(".")){
                        stack.push((String) path.subSequence(pOne + 1, i));
                    }
                }
                pOne = i;
            }
        }

        if(pOne < path.length()-1){
//            System.out.println("The sequence here is: " + (String)path.subSequence(pOne + 1 - Two Sum, path.length()));
            if(((String)path.subSequence(pOne + 1, path.length())).equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }else if(!((String)path.subSequence(pOne + 1, path.length())).equals(".")){
                stack.push((String) path.subSequence(pOne + 1, path.length()));
            }
        }

//        System.out.println("The length of the stack is " + stack.size());
        if(stack.isEmpty()) return "/";

        while(!stack.isEmpty()){
//            System.out.print(stack.peek() + " || ");
            finalpath.insert(0, "/" + stack.pop());
        }

        return finalpath.toString();
    }
}
