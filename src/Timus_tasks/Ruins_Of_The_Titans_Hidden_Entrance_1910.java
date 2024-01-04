package Timus_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Ruins_Of_The_Titans_Hidden_Entrance_1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        String[] array = in.nextLine().split(" ");

        int[] tripleSum = new int[size - 2];
        for (int i = 0; i < tripleSum.length; i++) {
            tripleSum[i] = Integer.parseInt(array[i]) +
                    Integer.parseInt(array[i + 1]) +
                    Integer.parseInt(array[i + 2]);
        }

        int[] tripleSumCopy = Arrays.copyOf(tripleSum, tripleSum.length);
        Arrays.sort(tripleSumCopy);
        int sum = tripleSumCopy[tripleSumCopy.length - 1];

        for (int i = 0; i < tripleSum.length; i++) {
            if (tripleSum[i] == sum) {
                System.out.printf("%s %s", sum, i + 2);
                break;
            }
        }

        in.close();
    }
}
