package problem1;

public class InvalidLength extends Exception{

    /**
     * Exception: to validate the length of a phone number
     * @param message
     */
    public InvalidLength(String message) {super(message);}
}
