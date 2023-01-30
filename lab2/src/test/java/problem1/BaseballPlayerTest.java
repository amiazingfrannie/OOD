package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaseballPlayerTest {

  private BaseballPlayer testBaseballPlayerNoLeague;
  private BaseballPlayer testBaseballPlayerWithLeague;
  private Name testName = new Name("Fran", "Lee", "Chan");
  private static final Double HEIGHT = 6.01;
  private static final Double WEIGHT = 100.01;
  private static final String LEAGUE = "Legend";
  private static final String TEAM = "CHANCE";
  private static final Double AVG_BATTING_SCORE = 22.3;
  private static final int NUM_OF_HOME_RUNS = 10;

  @BeforeEach
  void setUp() {
    testBaseballPlayerNoLeague = new BaseballPlayer(testName, HEIGHT, WEIGHT, TEAM, AVG_BATTING_SCORE, NUM_OF_HOME_RUNS);
    testBaseballPlayerWithLeague = new BaseballPlayer(testName, HEIGHT, WEIGHT, LEAGUE, TEAM, AVG_BATTING_SCORE, NUM_OF_HOME_RUNS);
  }

  @Test
  void getTeam() {
    assertEquals(TEAM, testBaseballPlayerNoLeague.getTeam());
    assertEquals(TEAM, testBaseballPlayerWithLeague.getTeam());
  }

  @Test
  void getAvgBattingScore() {
    assertEquals(AVG_BATTING_SCORE, testBaseballPlayerNoLeague.getAvgBattingScore());
    assertEquals(AVG_BATTING_SCORE, testBaseballPlayerWithLeague.getAvgBattingScore());
  }

  @Test
  void getNumOfHomeRuns() {
    assertEquals(NUM_OF_HOME_RUNS, testBaseballPlayerNoLeague.getNumOfHomeRuns());
    assertEquals(NUM_OF_HOME_RUNS, testBaseballPlayerWithLeague.getNumOfHomeRuns());
  }
}