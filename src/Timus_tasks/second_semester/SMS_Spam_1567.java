package Timus_tasks.second_semester;

import java.util.*;

public class SMS_Spam_1567 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String message = in.nextLine();
        int pressCount = 0;
        Map<String, ArrayList<Character>> keyBoard = getStringArrayListMap();

        String[] keys = {   "1", "2", "3",
                "4", "5", "6",
                "7", "8", "9",
                "0", "#"        };

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            String currentKey = "";

            for (int j = 0; j < keys.length; j++) {
                currentKey = keys[j];

                ArrayList<Character> symbolsOnKey = keyBoard.get(currentKey);
                for (int it = 0; it < symbolsOnKey.size(); it++) {
                    if (symbolsOnKey.get(it).equals(ch)) {
                        pressCount += (it + 1);
                        break;
                    }
                }
            }
        }

        System.out.println(pressCount);
    }

    private static Map<String, ArrayList<Character>> getStringArrayListMap() {
        Map<String, ArrayList<Character>> keyBoard = new HashMap<>();

        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        keyBoard.put("1", list1);

        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('d', 'e', 'f'));
        keyBoard.put("2", list2);

        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('g', 'h', 'i'));
        keyBoard.put("3", list3);

        ArrayList<Character> list4 = new ArrayList<>(Arrays.asList('j', 'k', 'l'));
        keyBoard.put("4", list4);

        ArrayList<Character> list5 = new ArrayList<>(Arrays.asList('m', 'n', 'o'));
        keyBoard.put("5", list5);

        ArrayList<Character> list6 = new ArrayList<>(Arrays.asList('p', 'q', 'r'));
        keyBoard.put("6", list6);

        ArrayList<Character> list7 = new ArrayList<>(Arrays.asList('s', 't', 'u'));
        keyBoard.put("7", list7);

        ArrayList<Character> list8 = new ArrayList<>(Arrays.asList('v', 'w', 'x'));
        keyBoard.put("8", list8);

        ArrayList<Character> list9 = new ArrayList<>(Arrays.asList('y', 'z'));
        keyBoard.put("9", list9);

        ArrayList<Character> list0 = new ArrayList<>(Arrays.asList('.', ',', '!'));
        keyBoard.put("0", list0);

        ArrayList<Character> listSpace = new ArrayList<>(Collections.singletonList(' '));
        keyBoard.put("#", listSpace);
        return keyBoard;
    }
}
