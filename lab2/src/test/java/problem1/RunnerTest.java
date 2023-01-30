package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RunnerTest{

  private Runner testRunnerNoLeague;
  private Runner testRunnerWithLeague;
  private Name testName = new Name("Fran", "Lee", "Chan");
  private static final Double HEIGHT = 6.01;
  private static final Double WEIGHT = 100.01;
  private static final String LEAGUE = "Legend";
  private static final Double BEAT5K_TIME = 10.01;
  private static final Double BEST_MARATHON_TIME = 123.55;
  private static final String FAV_RUNNING_EVENT = "Intl Marathon";

  @BeforeEach
  void setUp() {
    testRunnerNoLeague = new Runner(testName, HEIGHT, WEIGHT, BEAT5K_TIME, BEST_MARATHON_TIME, FAV_RUNNING_EVENT);
    testRunnerWithLeague = new Runner(testName, WEIGHT, HEIGHT, LEAGUE, BEAT5K_TIME, BEST_MARATHON_TIME, FAV_RUNNING_EVENT);
  }

  @Test
  void getBeat5KTime() {
    assertEquals(BEAT5K_TIME, testRunnerNoLeague.getBeat5KTime());
    assertEquals(BEAT5K_TIME, testRunnerWithLeague.getBeat5KTime());
  }

  @Test
  void getBestMarathonTime() {
    assertEquals(BEST_MARATHON_TIME, testRunnerNoLeague.getBestMarathonTime());
    assertEquals(BEST_MARATHON_TIME, testRunnerWithLeague.getBestMarathonTime());
  }

  @Test
  void getFavoriteRunningEvent() {
    assertEquals(FAV_RUNNING_EVENT, testRunnerNoLeague.getFavoriteRunningEvent());
    assertEquals(FAV_RUNNING_EVENT, testRunnerWithLeague.getFavoriteRunningEvent());
  }
}