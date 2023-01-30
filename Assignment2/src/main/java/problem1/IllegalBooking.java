package problem1;

/**
 * inherited from Exception
 * send out a message if there's something wrong with input
 */
public class IllegalBooking extends Exception{

  public IllegalBooking(String message){ super(message);}

}
