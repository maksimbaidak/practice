package by.java_masterclass_tasks;

public class Task_24 {

    public static void numberToWords(int number) {
        for(int restOfNum = reverse(number); restOfNum > 0; restOfNum /= 10){
            switch (restOfNum % 10) {
                case 0: System.out.println("Zero");
                    break;
                case 1: System.out.println("One");
                    break;
                case 2: System.out.println("Two");
                    break;
                case 3: System.out.println("Three");
                    break;
                case 4: System.out.println("Four");
                    break;
                case 5: System.out.println("Five");
                    break;
                case 6: System.out.println("Six");
                    break;
                case 7: System.out.println("Seven");
                    break;
                case 8: System.out.println("Eight");
                    break;
                case 9: System.out.println("Nine");
                    break;
            }
        }
    }

//    public static int getDigitCount(int number) {
//        int count = 0;
//        for(int restOfNum = number; restOfNum > 0; restOfNum /= 10){
//            count++;
//        }
//        return count;
//    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
}
