package Timus_tasks;

import java.util.Scanner;

public class On_The_Issue_Of_Sports_1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = Integer.parseInt(in.nextLine());
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            String[] line = in.nextLine().split(" ");

            for (int j = 0; j < size; j++) {
                array[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = i; j >= 0; j--)
                System.out.print(array[j][i - j] + " ");
        }

        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--)
                System.out.print(array[j][size - j + i - 1] + " ");
        }

        in.close();
    }
}
