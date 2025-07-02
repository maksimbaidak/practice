package by.java_masterclass_tasks;

public class Task_23 {

    public static boolean isPerfectNumber(int number) {
        if(number >= 1){
            int sum = 0;
            for (int counter = 1; counter < number; counter++){
                if(number % counter == 0){
                    sum += counter;
                }
            }
            return  sum == number;
        }
        return false;
    }
}
