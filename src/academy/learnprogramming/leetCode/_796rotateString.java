package academy.learnprogramming.leetCode;

public class _796rotateString {

    public static void main(String[] args) {
        String s ="aaaaab";
        String goal = "baaaaa";
        System.out.println(rotateString(s, goal));
    }

    private static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) { return false; }

        StringBuilder sMod = new StringBuilder(s);
        int i=0;
        while(i < s.length()){
            if(sMod.toString().equals(goal)) { return true; }
            sMod.append(sMod.charAt(0));
            sMod.deleteCharAt(0);
            i++;
        }

        return false;
    }
}
