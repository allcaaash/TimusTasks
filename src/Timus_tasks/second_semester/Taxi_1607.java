package Timus_tasks.second_semester;

import java.util.Scanner;

public class Taxi_1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();

        String[] strings = inputStr.split(" ");
        int petyaPrice = Integer.parseInt(strings[0]);
        int petyaStep = Integer.parseInt(strings[1]);
        int taxiPrice = Integer.parseInt(strings[2]);
        int taxiStep = Integer.parseInt(strings[3]);

        while (true) {
            if (petyaPrice >= taxiPrice) {
                System.out.println(petyaPrice);
                break;
            }
            petyaPrice += petyaStep;

            if (petyaPrice >= taxiPrice) {
                System.out.println(taxiPrice);
                break;
            }
            taxiPrice -= taxiStep;
        }
    }
}
