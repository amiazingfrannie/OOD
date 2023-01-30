package problem1;

public class BaseballPlayer extends Athlete{
  /**
   * inherits from Athlete
   * player's team, average batting scores and num of home run;
   */
  private String team;
  private Double avgBattingScore;
  private Integer numOfHomeRuns;

  /**
   * Constructor 1: inherits class Athlete, including league
   * @param athletesName Name
   * @param height double
   * @param weight double
   * @param league String
   * @param team String
   * @param avgBattingScore double
   * @param numOfHomeRuns int
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      String team, Double avgBattingScore, Integer numOfHomeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.avgBattingScore = avgBattingScore;
    this.numOfHomeRuns = numOfHomeRuns;
  }

  /**
   * Constructor 2: inherits class Athlete, league not included
   * @param athletesName
   * @param height
   * @param weight
   * @param team
   * @param avgBattingScore
   * @param numOfHomeRuns
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight,
      String team, Double avgBattingScore, Integer numOfHomeRuns) {
    super(athletesName, height, weight);
    this.team = team;
    this.avgBattingScore = avgBattingScore;
    this.numOfHomeRuns = numOfHomeRuns;
  }

  /**
   * method get team name
   * @return a string
   */
  public String getTeam(){
    return team;
  }

  /**
   * method get average batting score
   * @return a double type
   */
  public Double getAvgBattingScore() {
    return avgBattingScore;
  }

  /**
   * method get number of home runs
   * @return an int
   */
  public Integer getNumOfHomeRuns() {
    return numOfHomeRuns;
  }
}
