package TimusTasks;

import java.util.Scanner;

public class Localization_difficulties_1785 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int monstersNum = scanner.nextInt();
        String translation = "";

        if (monstersNum >= 1 && monstersNum <= 4){
            translation = "few";
        }
        else if(monstersNum >= 5 && monstersNum <= 9){
            translation = "several";
        }
        else if(monstersNum >= 10 && monstersNum <= 19){
            translation = "pack";
        }
        else if(monstersNum >= 20 && monstersNum <= 49){
            translation = "lots";
        }
        else if(monstersNum >= 50 && monstersNum <= 99){
            translation = "horde";
        }
        else if(monstersNum >= 100 && monstersNum <= 249){
            translation = "throng";
        }
        else if(monstersNum >= 250 && monstersNum <= 499){
            translation = "swarm";
        }
        else if(monstersNum >= 500 && monstersNum <= 999){
            translation = "zounds";
        }
        else if(monstersNum >= 1000){
            translation = "legion";
        }

        System.out.println(translation);
    }
}
