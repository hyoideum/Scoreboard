import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiveScoreboard {
    private final List<Match> matchList;

    public LiveScoreboard() {
        matchList = new ArrayList<>();
    }

    public void startMatch(Match match) {
        if(match == null) {
            throw new IllegalArgumentException("Match cannot be null");
        }
        matchList.add(match);
    }

    public void setScore(Match match, int homeScore, int awayScore) {
        if(match == null) {
            throw new IllegalArgumentException("Match cannot be null");
        }
        match.setScore(homeScore, awayScore);
    }

    public void finishMatch(Match match) {
        if(match == null) {
            throw new IllegalArgumentException("Match cannot be null");
        }
        matchList.remove(match);
    }

    public void getMatchSummary() {
        matchList.sort(Comparator
            .comparing(Match::getTotalScore)
            .thenComparing(Match::getNum)
            .reversed());
        
        for(Match m : matchList) {
            System.out.println(m.getHomeTeam() + " " + m.getHomeScore() + " - " + m.getAwayScore() + " " + m.getAwayTeam());
        }
    }
}