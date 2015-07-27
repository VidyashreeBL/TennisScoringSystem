/**
 * Created by test on 7/27/2015.
 */
class TennisScoreCalculatorTest extends GroovyTestCase {
    void testDisplayScores() {
        TennisScoreCalculator tsc = new TennisScoreCalculator("D")
        assert tsc.displayScores() == "15 0"
        tsc.setPlayerScoreSequence("F");
        assert tsc.displayScores() == "0 15"
        tsc.setPlayerScoreSequence("FD");
        assert tsc.displayScores() == "15 15"
        tsc.setPlayerScoreSequence("FD");
        assert tsc.displayScores() == "15 15"
        tsc.setPlayerScoreSequence("FD");
        assert tsc.displayScores() == "15 15"
        tsc.setPlayerScoreSequence("FDDF");
        assert tsc.displayScores() == "15 15"
    }

    void testSetPlayerScoreSequence() {

    }
}
