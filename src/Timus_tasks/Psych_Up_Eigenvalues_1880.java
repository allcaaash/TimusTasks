package Timus_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Psych_Up_Eigenvalues_1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;

        int size1 = Integer.parseInt(in.nextLine());
        String[] array1 = in.nextLine().split(" ");
        int size2 = Integer.parseInt(in.nextLine());
        String[] array2 = in.nextLine().split(" ");
        int size3 = Integer.parseInt(in.nextLine());
        String[] array3 = in.nextLine().split(" ");

        String[] resultArray = new String[size1 + size2 + size3];
        for (int i = 0; i < resultArray.length; i++) {
            if (i < size1) {
                resultArray[i] = array1[i];
                continue;
            }
            else if (i < (size1 + size2)) {
                resultArray[i] = array2[i - size1];
                continue;
            }
            resultArray[i] = array3[i - (size1 + size2)];
            continue;
        }

        Arrays.sort(resultArray);
        for (int i = 1; i < resultArray.length - 1; i++) {
            if (resultArray[i - 1].equals(resultArray[i]) && resultArray[i + 1].equals(resultArray[i]))
                result++;
        }

        System.out.println(result);

        in.close();
    }
}