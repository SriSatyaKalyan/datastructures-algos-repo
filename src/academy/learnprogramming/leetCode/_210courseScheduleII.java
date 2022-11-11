package academy.learnprogramming.leetCode;

import java.util.*;

public class _210courseScheduleII {

    public static void main(String[] args) {
//        int numCourses = 4;
//        int[][] prerequisites = {{1,0}, {2,0}, {3,1}, {3,2}, {5,4}};

        int numCourses = 2;
        int[][] prerequisites = {};

        int[] ans = findOrder(numCourses, prerequisites);
        for(int i:ans){
            System.out.print(i + ", ");
        }
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites){
        HashMap<Integer, ArrayList> courseMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        //building an adjacency list
        for(int i = 0; i < prerequisites.length; i++){
            int courseI = prerequisites[i][1];
            int courseII = prerequisites[i][0];

            if(!courseMap.containsKey(courseI)){
                courseMap.put(courseI, new ArrayList<Integer>());
            }
            courseMap.get(courseI).add(courseII);
        }

//        for(Map.Entry<Integer, ArrayList> course : courseMap.entrySet()){
//            System.out.print(course.getKey() + ": ");
//            for(int i=0; i < course.getValue().size(); i++){
//                System.out.print(course.getValue().get(i) + " , ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> basicCourses = new ArrayList<>();
        ArrayList<Integer> advancedCourses = new ArrayList<>();
        ArrayList<Integer> courseQueue = new ArrayList<>();
        ArrayList<Integer> coursePath = new ArrayList<>();
        int[] cP = new int[numCourses];

        for(Map.Entry<Integer, ArrayList> course : courseMap.entrySet()){
            if(!basicCourses.contains(course.getKey())){
                basicCourses.add(course.getKey());
            }
            for(int i=0; i < course.getValue().size(); i++){
                if(!advancedCourses.contains(course.getValue().get(i))){
                    advancedCourses.add((Integer) course.getValue().get(i));
                }
            }
        }
//
//        for(int i:basicCourses){
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//
//        for(int i:advancedCourses){
//            System.out.print(i + ", ");
//        }

        for(int i : basicCourses){
            if(!advancedCourses.contains(i)){
                courseQueue.add(i);
            }
        }

//        System.out.println();
        //Iterating through the queue
        while(courseQueue.size() > 0){
            int course = courseQueue.remove(0);
//            System.out.println("course: " + course + " | " + courseMap.get(course));
            if(courseMap.get(course) != null){
                for(int i=0; i < courseMap.get(course).size(); i++){
                    courseQueue.add((Integer) courseMap.get(course).get(i));
                }
            }
            if(!coursePath.contains(course)){
                coursePath.add(course);
            }
        }

//        System.out.println("coursePath");
//        for(int i:coursePath){
//            System.out.print(i + ", ");
//        }

//        if(coursePath.size() != numCourses){
//            return null;
//        }
        if(coursePath.size() == numCourses) {
            for(int i=0; i < cP.length; i++){
                cP[i] = coursePath.get(i);
            }
        }

        return cP;
    }
}