package TimusTasks;

import java.util.Scanner;

public class Bicycle_Codes_1877 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstCode = scanner.nextInt();
        int secondCode = scanner.nextInt();
        boolean heGuessIt = false;

        for (int i = 0; i <= 9999; i++){

            if ((i+2)%2==0){
                if(i==firstCode){
                    System.out.println("yes");
                    heGuessIt = true;
                    break;
                }
            }
            else{
                if(i==secondCode){
                    System.out.println("yes");
                    heGuessIt = true;
                    break;
                }
            }
        }

        if(!heGuessIt){
            System.out.println("no");
        }
    }
}
