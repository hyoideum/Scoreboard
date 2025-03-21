import java.time.LocalDateTime;

public class Match {
    private final String home;
    private final String away;
    private int scoreHome;
    private int scoreAway;
    private final LocalDateTime matchStart;
    private final int num;

    private static int counter;

    public Match(String home, String away) {
        this.home = home;
        this.away = away;
        this.scoreHome = 0;
        this.scoreAway = 0;
        this.matchStart = LocalDateTime.now();
        this.num = counter++;
    }

    public String getHome() {
        return home;
    }

    public String getAway() {
        return away;
    }

    public int getHomeScore() {
        return scoreHome;
    }

    public int getAwayScore() {
        return scoreAway;
    }

    public int getTotalScore() {
        return scoreHome + scoreAway;
    }

    public LocalDateTime getStart() {
        return matchStart;
    }

    public int getNum() {
        return num;
    }

    public void setScore(int scoreHome, int scoreAway) {
        if(scoreHome < 0 || scoreHome > 99 || scoreAway < 0 || scoreAway > 99) {
            throw new IllegalArgumentException("Invalid score!");
        }
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
    }
}
