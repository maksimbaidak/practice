package by.java_masterclass_tasks;

public class Task_25 {

    private final static int BIG_BAG_WEIGHT = 5;
    private final static int SMALL_BAG_WEIGHT = 1;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 || smallCount >= 0 || goal >= 0) {
            return bigCount * BIG_BAG_WEIGHT + smallCount * SMALL_BAG_WEIGHT == goal;
        }
        return false;
    }
}
