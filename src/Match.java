import java.time.LocalDateTime;

public class Match {
    private String home;
    private String away;
    private int scoreHome;
    private int scoreAway;

    public Match(String home, String away) {
        this.home = home;
        this.away = away;
        this.scoreHome = 0;
        this.scoreAway = 0;
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

    public void setScore(int scoreHome, int scoreAway) {
        if(scoreHome < 0 || scoreHome > 99 || scoreAway < 0 || scoreAway > 99) {
            throw new IllegalArgumentException("Invalid score!");
        }
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
    }

    public void PrintMatch() {
        System.out.print(home + " " + scoreHome + " - " + scoreAway + " " + away);
    }
}
