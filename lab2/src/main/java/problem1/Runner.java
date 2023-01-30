package problem1;

/**
 * class Runner
 */
public class Runner extends Athlete{
  /**
   * inherited from Athlete
   */
  private Double beat5KTime;
  private Double bestMarathonTime;
  private String favoriteRunningEvent;

  /**
   * Constructor for a runner, league included
   * @param athletesName inherit from Athlete
   * @param height inherit from Athlete
   * @param weight inherit from Athlete
   * @param league inherit from Athlete
   * @param beat5KTime double
   * @param bestMarathonTime double
   * @param favoriteRunningEvent string
   */

  public Runner(Name athletesName, Double height, Double weight, String league, Double beat5KTime,
      Double bestMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight, league);
    this.beat5KTime = beat5KTime;
    this.bestMarathonTime = bestMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * Constructor for a runner, league not included
   * @param athletesName inherit from Athlete
   * @param height inherit from Athlete
   * @param weight inherit from Athlete
   * @param beat5KTime double
   * @param bestMarathonTime double
   * @param favoriteRunningEvent string
   */
  public Runner(Name athletesName, Double height, Double weight, Double beat5KTime,
      Double bestMarathonTime, String favoriteRunningEvent) {
    super(athletesName, height, weight);
    this.beat5KTime = beat5KTime;
    this.bestMarathonTime = bestMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * to get time for running 5k
   * @return a double
   */
  public Double getBeat5KTime(){
    return beat5KTime;
  }

  /**
   * to get personal best record of marathon
   * @return
   */
  public Double getBestMarathonTime(){
    return bestMarathonTime;
  }

  /**
   * to get personal favorite running event
   * @return
   */
  public String getFavoriteRunningEvent(){
    return favoriteRunningEvent;
  }
}
