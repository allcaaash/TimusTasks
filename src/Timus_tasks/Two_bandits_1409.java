package TimusTasks;

import java.util.Scanner;

public class Two_bandits_1409 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int harry = scanner.nextInt();
        int larry = scanner.nextInt();

        int sumCan = (harry + larry) - 1;
        int harryResult = sumCan - harry;
        int larryResult = sumCan - larry;

        System.out.println(harryResult);
        System.out.println(larryResult);
    }
}
