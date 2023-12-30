package academy.learnprogramming.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _1496pathCrossing {

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }

    private static boolean isPathCrossing(String path) {
        HashMap<Character, Integer[]> map = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> visited = new HashMap<>();
        map.put('N', new Integer[] {0, 1});
        map.put('S', new Integer[] {0, -1});
        map.put('E', new Integer[] {1, 0});
        map.put('W', new Integer[] {-1, 0});

        int x = 0;
        int y = 0;
        visited.put(x, new ArrayList<Integer>());
        ArrayList<Integer> list = visited.get(x);
        list.add(y);
        System.out.println("x: " + x + " || y: " + y);

        for(char c : path.toCharArray()){
            x += map.get(c)[0];
            y += map.get(c)[1];
            System.out.println("x: " + x + " || y: " + y);
            if(visited.containsKey(x)){
                if(visited.get(x).contains(y)) return true;
                visited.get(x).add(y);
            }else {
                visited.put(x, new ArrayList<Integer>());
                list = visited.get(x);
                list.add(y);
            }
        }

        return false;
    }
}
