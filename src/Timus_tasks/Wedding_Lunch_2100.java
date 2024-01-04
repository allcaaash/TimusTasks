package TimusTasks;

import java.util.Scanner;

public class Wedding_Lunch_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 2;
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String guest = in.nextLine();
            String[] guests = guest.split("\\+");
            count += guests.length;
        }
        if (count == 13)
            count++;
        System.out.println(count * 100);

        in.close();
    }
}
