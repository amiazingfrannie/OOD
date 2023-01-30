package problem2;

public class Delivery {

    /**
     * Delivery class: store start location, end location, start time and end time
     */
    protected String startLoc;
    protected String endLoc;
    protected Time startTime;
    protected Time endTime;

    /**
     * Constructor: takes 4 params
     * @param startLoc  a String
     * @param endLoc a String
     * @param startTime a Time object
     * @param endTime a Time object
     */
    public Delivery(String startLoc, String endLoc, Time startTime, Time endTime) {
        this.startLoc = startLoc;
        this.endLoc = endLoc;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * method to get the duration, equals to the end time - start time
     * @return a Time object
     * if the input(hour, min or sec) is not valid:
     * @throws InvalidTimeError
     */
    public Time getDuration() throws InvalidTimeError {
        int HOURDIFF = this.endTime.hour - this.startTime.hour;
        int MINDIFF = this.endTime.min - this.startTime.min;
        int SECDIFF = this.endTime.sec - this.startTime.sec;
        System.out.println(HOURDIFF + ":" + MINDIFF + ":" + SECDIFF);
        return new Time(HOURDIFF, MINDIFF, SECDIFF);
    }

    /**
     * method to get start location
     * @return a string
     */
    public String getStartLoc(){ return this.startLoc;}

    /**
     * method to get end location
     * @return a string
     */
    public String getEndLoc(){ return this.endLoc;}

}
