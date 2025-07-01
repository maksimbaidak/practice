package by.java_masterclass_tasks;

public class Task_17 {

    public static int sumFirstAndLastDigit(int num){
        if(num < 0){
            return -1;
        }else {
            int lastDigit = num % 10;
            while (num > 9){
                num /= 10;
            }
            return lastDigit + num;
        }
    }
}
