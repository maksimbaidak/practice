package by.java_masterclass_tasks;

public class Task_43 {
    public static void reverse(int[] array) {
        Task_41.printArray(array);
        int maxIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        Task_41.printArray(array);
    }
}
