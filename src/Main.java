//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LiveScoreboard scoreboard = new LiveScoreboard();
        Match m1 = new Match("South Korea", "Norway");
        Match m2 = new Match("Egypt", "Ireland");
        Match m3 = new Match("Argentina", "Sweden");
        Match m4 = new Match("Greece", "Senegal");
        Match m5 = new Match("South Africa", "Australia");

        scoreboard.startMatch(m1);
        scoreboard.startMatch(m2);
        scoreboard.startMatch(m3);
        scoreboard.startMatch(m4);
        scoreboard.startMatch(m5);

        scoreboard.setScore(m1, 1, 0);
        scoreboard.setScore(m2, 2, 0);
        scoreboard.setScore(m3, 1, 1);
        scoreboard.setScore(m4, 3, 1);
        scoreboard.setScore(m5, 2, 2);

        scoreboard.getMatchSummary();
        scoreboard.finishMatch(m1);
        System.out.println("Summary after finish");
        scoreboard.getMatchSummary();

    }
}