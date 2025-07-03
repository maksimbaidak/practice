package by.java_masterclass_tasks;

public class Task_27 {

    public static void printSquareStar(int num) {
        int lineA = 2;
        int lineB = num - 1;

        for (int z = 1; z <= num; z++) {
            for (int v = 1; v <= num; v++) {

                if (z == num | z == 1) {
                    System.out.print("*");
                } else {

                    if (v == num | v == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print((lineA == v | lineB == v) ? "*" : " ");
                    }
                }
            }
            lineA++;
            lineB--;
            System.out.println();
        }
    }
}
