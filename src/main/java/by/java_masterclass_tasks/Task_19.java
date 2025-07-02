package by.java_masterclass_tasks;

public class Task_19 {

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 >= 10 & num1 <= 99 & num2 >= 10 & num2 <= 99){
            for(int restOfNum1 = num1; restOfNum1 > 0; restOfNum1 /= 10){
                for(int restOfNum2 = num2; restOfNum2 > 0; restOfNum2 /= 10){
                    if(restOfNum1 % 10 == restOfNum2 % 10) return true;
                }
            }
        }
        return false;
    }
}
