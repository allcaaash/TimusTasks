package Timus_tasks;

import java.util.Scanner;

public class Four_little_devils_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                result += (i + 1);
            else
                result -= (i - 1);
        }
        if (result % 2 == 0)
            System.out.println("black");
        else
            System.out.println("grimy");
    }
}
