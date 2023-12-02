package TimusTasks;

import java.util.Scanner;

public class Mathematics_And_Berries_2001 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int before1 = in.nextInt();
        int before2 = in.nextInt();

        int secondToFirst1 = in.nextInt();
        int secondToFirst2 = in.nextInt();

        int firstToSecond1 = in.nextInt();
        int firstToSecond = in.nextInt();

        int result1 = before1 - firstToSecond1;
        int result2 = before2 - secondToFirst2;

        System.out.println(result1);
        System.out.println(result2);
    }
}
