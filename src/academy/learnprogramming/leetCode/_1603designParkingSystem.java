package academy.learnprogramming.leetCode;

public class _1603designParkingSystem {

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}

class ParkingSystem {

    int[] cache = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        this.cache[1] = big;
        this.cache[2] = medium;
        this.cache[3] = small;
    }

    public boolean addCar(int carType) {
        if (this.cache[carType] == 0) return false;
        this.cache[carType] -= 1;
        return true;
    }

}