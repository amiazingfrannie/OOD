package problem1;

import java.util.Objects;

/**
 * class Room
 * to store the maximum occupancy, price and current number of guests of one room
 */
public class Rooms {

  protected int maxOccupancy;
  protected double price;
  protected int numOfGuests;

  /**
   * Constructor, initialized with 3 params, but only with valid price, which is always >0
   * @param maxOccupancy int
   * @param price double
   * @param numOfGuests int
   * @throws IllegalBooking if the price is invalid, throw an exception
   */
  public Rooms(int maxOccupancy, double price, int numOfGuests) throws IllegalBooking{
    this.maxOccupancy = maxOccupancy;
    if (validPrice(price))
      this.price = price;
    else throw new IllegalBooking("invalid price setting!");
    this.numOfGuests = numOfGuests;
  }

  /**
   * private helper function, to verify if the price is greater than 0
   * @param price double
   * @return true or false
   */
  private boolean validPrice(double price){return (price > 0);}

  /**
   * method to get the current number of guests in one room
   * @return an int
   */
  public int getNumOfGuests(){return this.numOfGuests;}

  /**
   * method to get the maximum occupancy of one room
   * @return an int
   */
  public int getMaxOccupancy(){return this.maxOccupancy;}
  //public double getPrice(){return this.price;}

  /**
   * method to get the price of one room
   * @return a double
   */
  public double getPrice(){ return this.price;}
  /**
   * function to check if the room is available
   * if current number of guests in one room is 0, it's available
   * else, it's not
   * @return true or false
   */
  public boolean isAvailable(){
    if (this.getNumOfGuests() > 0){return false;}
    else return true;
  }

  /**
   * function to book a room
   * if the room is available and
   * the number of guests is bigger than 0 and less than the max occupancy,
   * change numOfGuest of this room
   * @param numOfGuests number of upcoming guests
   * @return an int, current number of guests
   * @throws IllegalBooking if the condition is not satisfied, throw an exception
   */
  public int bookRoom(int numOfGuests) throws IllegalBooking{
    if (this.isAvailable() && numOfGuests > 0 && numOfGuests <= this.getMaxOccupancy()){
      this.numOfGuests = numOfGuests;
      return this.numOfGuests;
    }
    else throw new IllegalBooking("invalid booking!");
  }

  /**
   * override the method equal()
   * @param o new object
   * @return true or false
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Rooms rooms)) {
      return false;
    }
    return maxOccupancy == rooms.maxOccupancy
        && Double.compare(rooms.price, price) == 0
        && numOfGuests == rooms.numOfGuests;
  }

  /**
   * override the method hashCode()
   * @return an int
   */
  @Override
  public int hashCode() {
    return Objects.hash(maxOccupancy, price, numOfGuests);
  }
}
