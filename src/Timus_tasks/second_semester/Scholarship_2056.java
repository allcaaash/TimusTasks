package Timus_tasks.second_semester;

import java.util.Scanner;

public class Scholarship_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String result = "";
        int examNum = in.nextInt();
        in.nextLine();

        boolean isNamed = false;
        boolean isHigh = false;
        boolean isUsual = false;
        boolean isNone = false;
        double averageScore = 0;
        for (int i = 0; i < examNum; i++) {
            int evaluation = in.nextInt();
            in.nextLine();

            averageScore += evaluation;

            if (evaluation == 3) {
                isNamed = false;
                isHigh = false;
                isUsual = false;
                isNone = true;
            }
        }

        if (isNone) {
            System.out.println("None");
            return;
        }

        averageScore /= examNum;
        if (averageScore == 5) {
            isNamed = true;
            System.out.println("Named");
        }

        if (!isNamed && averageScore >= 4.5) {
            isHigh = true;
            System.out.println("High");
        }

        if (!isNamed && !isHigh) {
            isUsual = true;
            System.out.println("Common");
        }
    }
}
