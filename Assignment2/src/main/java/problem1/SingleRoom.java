package problem1;


/**
 * class SingleRoom, inherited from Rooms
 * takes 3 params, maxOccupancy, price and numOfGuests
 * maximum occupancy should only be 1
 */
public class SingleRoom extends Rooms{
  private static final int MAX_OCCUPANCY = 1;

  /**
   * Constructor: initialize a single room, with maximum occupancy as 1 and number of current guest = 0
   * @param maxOccupancy only be 1
   * @param price double (greater than 0, validated in Rooms class)
   * @param numOfGuests int, with an initial value 0
   * @throws IllegalBooking if the max occupancy is not 1, throw an exception
   */
  public SingleRoom(int maxOccupancy, double price, int numOfGuests) throws IllegalBooking {
    super(maxOccupancy, price, numOfGuests);
    if (this.validMaxOccupancy(maxOccupancy))
      this.maxOccupancy = maxOccupancy;
    else throw new IllegalBooking("Invalid Max Occupancy");
    this.numOfGuests = 0;
  }

  /**
   * a private helper function to verify if the maxOccupancy is 1;
   * @param maxOccupancy
   * @return true or false
   */
  private boolean validMaxOccupancy(int maxOccupancy){ return maxOccupancy == MAX_OCCUPANCY;}


}
