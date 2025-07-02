package by.java_masterclass_tasks;

public class Task_18 {

    public static int getEvenDigitSum(int num){
        if(num < 0){
            return -1;
        }else {
            int sum = 0;
            for(int restOfNum = num; restOfNum > 0; restOfNum /= 10){
                int lastDigit = restOfNum % 10;
                if(lastDigit % 2 == 0) sum += lastDigit;
            }
            return sum;
        }
    }
}
