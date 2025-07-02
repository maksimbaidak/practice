package by.java_masterclass_tasks;

public class Task_20 {

    public static boolean hasSameLastDigit(int one, int two, int three) {

        if (!isValid(one) || !isValid(two) || !isValid(three)) {
            return false;
        }

        int lastDigitOne = one % 10;
        int lastDigitTwo = two % 10;
        int lastDigitThree = three % 10;
        return (lastDigitOne == lastDigitTwo) ||
                (lastDigitOne == lastDigitThree) ||
                (lastDigitTwo == lastDigitThree);
    }

    public static boolean isValid(int value) {
        return value >= 10 & value <= 1000;
    }
}
