package TimusTasks;

import java.util.Scanner;

public class Turn_On_The_MEGA_1787 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int carPerMin = in.nextInt();
        int minutes = in.nextInt();

        int[] cars = new int[minutes];

        for(int i = 0; i < cars.length; i++){

           cars[i] = in.nextInt();
        }

        int result = 0;
        for (int j = 0; j < cars.length; j++){

            result += cars[j] - carPerMin;
            if (result < 0){
                result = 0;
            }
        }

        System.out.println(result);
    }
}
