package Timus_tasks.second_semester;

import java.util.Scanner;

public class The_Battle_Of_The_Swamp_1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputStr = in.nextLine();
        String[] strings = inputStr.split(" ");
        int n = Integer.parseInt(strings[0]);
        int k = Integer.parseInt(strings[1]);

        int[] boomBooms = new int[n];
        for (int i = 0; i < n; i++)
            boomBooms[i] = in.nextInt();

        int unusedBoomBoom = 0;
        int survivingDroids = 0;

        for (int i = 0; i < n; i++) {
            if (boomBooms[i] >= k)
                unusedBoomBoom += (boomBooms[i] - k);
            else
                survivingDroids += (k - boomBooms[i]);
        }

        System.out.println(unusedBoomBoom + " " + survivingDroids);
    }
}
