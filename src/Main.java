//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Match m1 = new Match("Hrvatska", "Francuska");
        Match m2 = new Match("Mexico", "Canada");
        Match m3 = new Match("Italy", "urugvay");
        Match m4 = new Match("Bih", "USA");
        new Match("Japan", "Bolivia");

        m1.setScore(1,0);
        m2.setScore(3,1);
        m3.setScore(0,2);
        m3.finishMatch();
        m4.setScore(0,1);
        m1.PrintMatches();
    }
}