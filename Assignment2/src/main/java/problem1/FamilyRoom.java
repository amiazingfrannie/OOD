package problem1;

/**
 * class FamilyRoom, inherited from Rooms
 * takes 3 params, maxOccupancy, price and numOfGuests
 * maximum occupancy should only be 4
 */
public class FamilyRoom extends Rooms{

  private static final int MAX_OCCUPANCY = 4;

  /**
   * Constructor: initialize a Double room, with maximum occupancy is 4 and number of current guest = 0
   * @param maxOccupancy only be 4
   * @param price double (greater than 0, validated in Rooms class)
   * @param numOfGuests int, with an initial value 0
   * @throws IllegalBooking if the max occupancy is not equal to 4, throw an exception
   */
  public FamilyRoom(int maxOccupancy, double price, int numOfGuests) throws IllegalBooking {
    super(maxOccupancy, price, numOfGuests);
    if (this.validMaxOccupancy(maxOccupancy))
      this.maxOccupancy = maxOccupancy;
    else throw new IllegalBooking("Invalid Max Occupancy");
    this.numOfGuests = 0;
  }

  /**
   * a private helper function to verify if the maxOccupancy is 4;
   * @param maxOccupancy
   * @return true or false
   */
  private boolean validMaxOccupancy(int maxOccupancy){ return maxOccupancy == MAX_OCCUPANCY;}


}
