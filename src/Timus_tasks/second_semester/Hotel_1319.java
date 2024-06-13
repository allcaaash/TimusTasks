package Timus_tasks.second_semester;

import java.util.Scanner;

public class Hotel_1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] table = new int[n][n];

        int num = 1;

        for (int d = 0; d < 2 * n - 1; d++) {
            int row = (d < n) ? 0 : (d - n + 1);
            int col = (d < n) ? (n - 1 - d) : 0;
            while (row < n && col < n) {
                table[row][col] = num++;
                row++;
                col++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
