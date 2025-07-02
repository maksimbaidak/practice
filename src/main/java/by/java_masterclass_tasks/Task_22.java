package by.java_masterclass_tasks;

public class Task_22 {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first >= 10 & second >= 10){
            int divisor = 1;
            int smallerInt = first > second ? second : first;
            for(int i = 1; i <= smallerInt; i++){
                if(first % i == 0 & second % i ==0){
                    divisor = i;
                }
            }
            return divisor;
        }
        return -1;
    }
}
