package Timus_tasks.second_semester;

import java.util.HashMap;
import java.util.Scanner;

public class Elections_1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int candidatesNum;
        int lineNum;

        String str = in.nextLine();
        String[] split = str.split(" ");
        candidatesNum = Integer.parseInt(split[0]);
        lineNum = Integer.parseInt(split[1]);

        HashMap<Integer, Integer> candidates = new HashMap<>();
        for (int i = 1; i <= candidatesNum; i++)
            candidates.put(i, 0);

        for (int i = 0; i < lineNum; i++) {
            int candidate = in.nextInt();
            in.nextLine();
            int votes = candidates.get(candidate);
            votes++;
            candidates.put(candidate, votes);
        }

        for (int i = 1; i <= candidatesNum; i++) {
            int votes = candidates.get(i);
            double votesPercent = (double) (votes * 100) / lineNum;
            String formattedVotesPercent = String.format("%.2f", votesPercent);
            System.out.println(STR."\{formattedVotesPercent}%");
        }
    }
}
