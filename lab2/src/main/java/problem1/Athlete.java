package problem1;

/**
 Class Athlete stores information about an athlete.
 **/
public class Athlete {

  protected Name athletesName;
  protected Double height;
  protected Double weight;
  protected String league;

  /**
   Constructor for the class Athlete.
   @param athletesName - String, representing athlete's name
   @param height - Double, representing athlete's height
   @param weight - Double, representing athlete's weight
   @param league - String, representing athlete's league

   twp constructors: the signature is different
   **/
  public Athlete(Name athletesName, Double height, Double weight, String league) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = league;
  }

  /**
   Constructor for the class Athlete.
   @param athletesName - String, representing athlete's name
   @param height - Double, representing athlete's height
   @param weight - Double, representing athlete's weight
   **/
  public Athlete(Name athletesName, Double height, Double weight) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = null;
  }

  /**
   @return - problem1.Name, giving athlete's name
   **/
  public Name getAthletesName() {
    return athletesName;
  }

  /**
   @return - Double, giving athlete's height
   **/
  public Double getHeight() {
    return height;
  }

  /**
   @return - Double, giving athlete's weight
   **/
  public Double getWeight() {
    return weight;
  }

  /**
   @return - String, giving athlete's league
   **/
  public String getLeague() { return league;}

}
