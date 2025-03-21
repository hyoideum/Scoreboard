import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Match {
    public enum Status {
        ACTIVE,
        FINISHED
    }

    private static List<Match> matchList = new ArrayList<>();

    private String home;
    private String away;
    private int scoreHome;
    private int scoreAway;
    private LocalDateTime matchStart;
    private Status status;

    public Match(String home, String away) {
        this.home = home;
        this.away = away;
        this.scoreHome = 0;
        this.scoreAway = 0;
        this.matchStart = LocalDateTime.now();
        this.status = Status.ACTIVE;

        matchList.add(this);
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

    private int getTotalScore() {
        return scoreHome + scoreAway;
    }

    public LocalDateTime getStart() {
        return matchStart;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setScore(int scoreHome, int scoreAway) {
        if(scoreHome < 0 || scoreHome > 99 || scoreAway < 0 || scoreAway > 99) {
            throw new IllegalArgumentException("Invalid score!");
        }
        this.scoreHome = scoreHome;
        this.scoreAway = scoreAway;
        SortList();
    }

    public void finishMatch() {
        this.status = Status.FINISHED;
        matchList.remove(this);
    }

    private void SortList() {
        matchList.sort(Comparator
                .comparing(Match::getTotalScore)
                .thenComparing(Match::getStart)
                .reversed());
    }

    public void PrintMatch() {
        System.out.println(home + " " + scoreHome + " - " + scoreAway + " " + away);
    }

    public void PrintMatches() {
        for(Match m : matchList) {
            m.PrintMatch();
        }
    }
}
