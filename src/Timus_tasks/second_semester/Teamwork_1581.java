package Timus_tasks.second_semester;

import java.util.Scanner;

public class Teamwork_1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        in.nextLine();
        String numbers = in.nextLine();

        String[] array = numbers.split(" ");

        StringBuilder result = new StringBuilder();
        int currentCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1]))
                currentCount++;
            else {
                result.append(currentCount).append(" ").append(array[i - 1]).append(" ");

                currentCount = 1;
            }
        }
        result.append(currentCount).append(" ").append(array[size - 1]);

        System.out.println(result);
    }
}
