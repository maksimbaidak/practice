package by.java_masterclass_tasks;

public class Task_42 {
    public static int findMin(int[] array) {
        int minInt = Integer.MAX_VALUE;
        for (int el : array) {
            if (minInt > el) {
                minInt = el;
            }
        }
        return minInt;
    }

    public static int findMin2(int[] array) {
        return Task_41.sortInt(array)[array.length - 1];
    }
}
