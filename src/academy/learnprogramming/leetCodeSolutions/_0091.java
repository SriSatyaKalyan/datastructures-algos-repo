package academy.learnprogramming.leetCodeSolutions;

import java.util.HashMap;

public class _0091 {

    public static void main(String[] args) {
        String s = "226";
        System.out.println(numDecodings(s));
    }

    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int numDecodings(String s) {
        return recursiveWithMemo(0, s);
    }

    private static int recursiveWithMemo(int index, String str) {
        // Have we already seen this substring?
        if (memo.containsKey(index)) { return memo.get(index); }

        // If you reach the end of the string - Return 1 for success.
        if (index == str.length()) { return 1; }

        // If the string starts with a zero, it can't be decoded
        if (str.charAt(index) == '0') { return 0; }

        if (index == str.length() - 1) { return 1; }

        int ans = recursiveWithMemo(index + 1, str);
        if (Integer.parseInt(str.substring(index, index + 2)) <= 26) {
            ans += recursiveWithMemo(index + 2, str);
        }

        // Save for memoization
        memo.put(index, ans);
        return ans;
    }
}

// TC: O(N) where N is the length of the string. Memoization helps in pruning the recursion tree and hence decoding the index only once.

// SC: O(N). The dictionary used for memoization would take the space equal to the length of the string. There would be an entry for evey index value.
// The recursion stack would also be equal to the length of the string