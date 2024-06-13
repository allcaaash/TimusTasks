package Timus_tasks.second_semester;

import java.util.Scanner;

public class Penguins_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int notes = in.nextInt();
        in.nextLine();

        int EPCount = 0;
        int LPCount = 0;
        int MPCount = 0;
        for (int i = 0; i < notes; i++) {
            String name = in.nextLine();
            if (name.equals("Emperor Penguin"))
                EPCount++;
            else if (name.equals("Little Penguin"))
                LPCount++;
            else if (name.equals("Macaroni Penguin"))
                MPCount++;
        }

        if (EPCount > LPCount && EPCount > MPCount)
            System.out.println("Emperor Penguin");
        else if (LPCount > EPCount && LPCount > MPCount)
            System.out.println("Little Penguin");
        else if (MPCount > EPCount && MPCount > LPCount)
            System.out.println("Macaroni Penguin");
    }
}
