package by.java_masterclass_tasks;

public class Task_21 {

    public static void printFactors(int number) {
        if(number >= 1){
            for(int counter = number; counter >= 1; counter--){
                if (number % counter == 0){
                    System.out.println(counter);
                }
            }
        }else {
            System.out.println("Invalid value");
        }
    }
}
