package Timus_tasks;

import java.util.Scanner;

public class Sum_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
         if (n > 1) {
             for ( int i = 1; i <= n; i++) {
                 sum += i;
             }
         }
         else {
             for ( int i = n; i <= 1; i++) {
                 sum += i;
             }
         }

         System.out.println(sum);
         in.close();
    }
}
