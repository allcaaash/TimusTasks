package Timus_tasks.second_semester;

import java.util.*;

public class Donald_The_Postman_2023 {
    public static void main(String[] args) {
        Map<Integer, List<Character>> map = new LinkedHashMap<>();
        map.put(1, Arrays.asList('A', 'P', 'O', 'R'));
        map.put(2, Arrays.asList('B', 'M', 'S'));
        map.put(3, Arrays.asList('D', 'G', 'J', 'K', 'T', 'W'));

        Scanner in = new Scanner(System.in);

        int stepCount = 0;
        int currentWardrobe = 1;
        int letterCount = in.nextInt();

        for (int i = 0; i < letterCount; i++) {
            String letter = in.next();
            char firstChar = letter.charAt(0);

            int keyValue = -1;

            for (Map.Entry<Integer, List<Character>> entry : map.entrySet()) {
                if (entry.getValue().contains(firstChar)) {
                    keyValue = entry.getKey();
                    break;
                }
            }

            stepCount += Math.abs(currentWardrobe - keyValue);
            currentWardrobe = keyValue;
        }

        System.out.println(stepCount);
    }
}
