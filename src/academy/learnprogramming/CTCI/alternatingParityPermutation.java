//package academy.learnprogramming.CTCI;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.IntStream;
//
//public class alternatingParityPermutation {
//
//    public static void main(String[] args) {
//        int n= 2;
//        findParity(n);
//    }
//
//    private static ArrayList<ArrayList<Integer>> findParity(int n) {
//        int[] num = IntStream.rangeClosed(1, n).toArray();
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//
//        //start from an empty list
//        result.add(new ArrayList<Integer>());
//
//        for (int i = 0; i < num.length; i++) {
//            //list of list in current iteration of the array num
//            List<List<Integer>> current = new ArrayList<>();
//
//            for (ArrayList<Integer> l : result) {
//                // # of locations to insert is largest index + 1
//                for (int j = 0; j < l.size()+1; j++) {
//                    // + add num[i] to different locations
//                    l.add(j, num[i]);
//
//                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
//                    current.add(temp);
//
//                    //System.out.println(temp);
//
//                    // - remove num[i] add
//                    l.remove(j);
//                }
//            }
//
//            result = new ArrayList<ArrayList<Integer>>((Collection<? extends ArrayList<Integer>>) current);
//        }
//
//        return result;
//    }
//
//
//}
