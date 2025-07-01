package by.java_masterclass_tasks;

public class Task_16 {

    public static boolean isPalindrome(int num){
        if(num < 0) num *= -1;
        int reversedNum = 0;
        for(int restOfNum = num; restOfNum > 0; restOfNum /= 10){
            int lastDigit = restOfNum % 10;
            reversedNum = reversedNum * 10 + lastDigit;
        }
        return reversedNum == num;
    }
}
