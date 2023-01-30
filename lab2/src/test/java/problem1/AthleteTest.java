package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AthleteTest {

  private Athlete testAthleteWithLeague;
  private Athlete testAthleteNoLeague;
  private Name testName;

  private static final String FIRST_NAME = "Fran";
  private static final String LAST_NAME = "Chan";
  private static final String MID_NAME = "Lee";
  private static final double HEIGHT = 6.1;
  private static final double WEIGHT = 190.0;
  private static final String LEAGUE = "Legend";

  @BeforeEach
  void setUp() {
    testName = new Name(FIRST_NAME, MID_NAME, LAST_NAME);
    testAthleteNoLeague = new Athlete(testName, HEIGHT, WEIGHT);
    testAthleteWithLeague = new Athlete(testName, HEIGHT, WEIGHT, LEAGUE);
  }

  @Test
  void getAthletesName() {
    assertEquals(testName, testAthleteNoLeague.getAthletesName());
  }

  @Test
  void getHeight() {
    assertEquals(HEIGHT, testAthleteNoLeague.getHeight());
    assertEquals(HEIGHT, testAthleteWithLeague.getHeight());
  }

  @Test
  void getWeight() {
    assertEquals(WEIGHT, testAthleteNoLeague.getWeight());
    assertEquals(WEIGHT, testAthleteWithLeague.getWeight());
  }

  @Test
  void getLeague() {
    assertEquals(LEAGUE, testAthleteWithLeague.getLeague());
  }
}