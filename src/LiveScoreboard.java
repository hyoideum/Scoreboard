import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiveScoreboard {
    private final List<Match> matchList;

    public LiveScoreboard() {
        matchList = new ArrayList<>();
    }

    public void startMatch(Match match) {
        matchList.add(match);
    }

    public void setScore(Match match, int homeScore, int awayScore) {
        match.setScore(homeScore, awayScore);
    }

    public void finishMatch(Match match) {
        matchList.remove(match);
    }

    public void getMatchSummary() {
        matchList.sort(Comparator
            .comparing(Match::getTotalScore)
            .thenComparing(Match::getNum)
            .reversed());
        
        for(Match m : matchList) {
            System.out.println(m.getHome() + " " + m.getHomeScore() + " - " + m.getAwayScore() + " " + m.getAway());
        }
    }
}