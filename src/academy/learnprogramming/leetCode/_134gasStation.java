package academy.learnprogramming.leetCode;

public class _134gasStation {

    private static int calculateStation(int[] gas, int[] cost) {
        int currGain, answer  = -1, diff, steps = 1, mover;

        for(int i = 0; i < gas.length; i++){
            currGain = 0;
            System.out.println("gas: " + gas[i] + " || cost: " + cost[i] + " || diff: " + (gas[i] - cost[i]));
            if(gas[i] - cost[i] >= 0){
                mover = i;
                steps = 1;
                System.out.println("Entered the if loop at " + mover);

                do{
                    diff = gas[mover] - cost[mover];
                    System.out.println(" mover: " + mover + " | currGain: " + currGain
                            + " | diff: " + diff + " | steps: " + steps);
                    currGain += diff;

                    mover++;
                    if(mover == gas.length) mover = 0;

                    steps++;
                    if(steps == gas.length + 1 && mover == i && currGain >= 0){
                        return i;
                    }

                }while(currGain >= 0);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        int[] gas = {1,2,3,4,5};
//        int[] cost = {3,4,5,1,2};

        int[] gas = {0, 0, 2};
        int[] cost = {0, 0, 2};

        System.out.println("The index is: " + calculateStation(gas, cost));
    }



}
