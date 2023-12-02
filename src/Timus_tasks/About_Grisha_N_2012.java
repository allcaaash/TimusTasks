package TimusTasks;

import java.util.Scanner;

public class About_Grisha_N_2012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalTasks = 12;
        int firstHourTasks = scanner.nextInt();

        // 5 hours = 300 minutes
        int remainingTime = 300 - 60; //4 hours(240 minutes) after firstHourTasks
        int remainingTasks = totalTasks - firstHourTasks;

        for (int i = 0; i < remainingTasks; i++){
            remainingTime -= 45;
        }

        if (remainingTime >= 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
