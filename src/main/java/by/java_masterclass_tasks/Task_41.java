package by.java_masterclass_tasks;

import java.util.Arrays;
import java.util.Random;

public class Task_41 {
    public static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static int[] getIntegers(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int[] sortInt(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
