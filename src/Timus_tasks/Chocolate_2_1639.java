package Timus_tasks;

import java.util.Scanner;

public class Chocolate_2_1639 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = in.nextLine().split(" ");
        int m = Integer.parseInt(array[0]);
        int n = Integer.parseInt(array[1]);

        if (m % 2 == 1 && n % 2 == 1)
            System.out.println("[second]=:]");
        else
            System.out.println("[:=[first]");

        in.close();
    }
}
