package Timus_tasks;

import java.util.Scanner;

public class One_In_The_Field_Is_A_Warrior_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            String square = in.next();
            int horisontal = square.charAt(0);
            int vertical = Character.getNumericValue(square.charAt(1));

            count += (vertical + 2 <= 8 && horisontal - 1 >= 97) ? 1 : 0;
            count += (vertical + 2 <= 8 && horisontal +1  <= 104) ? 1 : 0;
            count += (vertical - 2 >= 1 && horisontal - 1 >= 97) ? 1 : 0;
            count += (vertical - 2 >= 1 && horisontal + 1 <= 104) ? 1 : 0;
            count += (horisontal + 2 <= 104 && vertical - 1 >= 1) ? 1 : 0;
            count += (horisontal + 2 <= 104 && vertical + 1 <= 8) ? 1 : 0;
            count += (horisontal - 2 >= 97 && vertical - 1 >= 1) ? 1 : 0;
            count += (horisontal - 2 >= 97 && vertical + 1 <= 8) ? 1 : 0;

            result[i] = count;
        }

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

        in.close();
    }
}
