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
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
