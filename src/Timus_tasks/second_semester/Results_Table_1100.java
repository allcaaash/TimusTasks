package Timus_tasks.second_semester;

import java.util.*;

public class Results_Table_1100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int teamNum = in.nextInt();
        in.nextLine();

        List<Team> teams = new ArrayList<>(teamNum);

        for (int i = 0; i < teamNum; i++) {
            String string = in.nextLine();
            String[] strings = string.split(" ");
            int id = Integer.parseInt(strings[0]);
            int solvedProblems = Integer.parseInt(strings[1]);
            teams.add(new Team(id, solvedProblems));
        }

        Collections.sort(teams, (team1, team2) -> {
            if (team2.solvedProblems == team1.solvedProblems) {
                return Integer.compare(teams.indexOf(team1), teams.indexOf(team2));
            }
            return Integer.compare(team2.solvedProblems, team1.solvedProblems);
        });

        for (Team team : teams)
            System.out.println(STR."\{team.id} \{team.solvedProblems}");
    }

    static class Team {
        int id;
        int solvedProblems;

        Team(int id, int solvedProblems) {
            this.id = id;
            this.solvedProblems = solvedProblems;
        }
    }
}
