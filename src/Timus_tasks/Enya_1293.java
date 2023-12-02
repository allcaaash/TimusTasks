package TimusTasks;

import java.util.Scanner;
public class Enya_1293 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int resul = ((height * width) * 2 ) * num;

        System.out.println(resul);
    }
}
