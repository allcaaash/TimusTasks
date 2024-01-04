package Timus_tasks;

import java.util.Scanner;

public class Flags_1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] array = new long[n];

        if (n > 2) {
            array[0] = 2;
            array[1] = 2;
            for (int i = 2; i < array.length; ++i) {
                array[i] = array[i - 1] + array[i - 2];
            }

            System.out.println(array[n - 1]);
        }
        else
            System.out.println(2);

        in.close();
    }
}
