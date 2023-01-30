package problem2;

/**
 * inherited from Exception
 * send out a message if there's something wrong with input
 */
public class InvalidMailException extends Exception{

  public InvalidMailException(String message){ super(message);}
}
