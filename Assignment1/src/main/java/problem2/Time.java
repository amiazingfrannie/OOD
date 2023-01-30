package problem2;

public class Time {

    /**
     * Time class: to define a Time object, takes hour, minutes, and seconds
     */
    protected int hour;
    protected int min;
    protected int sec;

    /**
     * Constructor: validate hour, min and sec through a private helper function: validHour/Min/Sec
     * if the input is valid, store it
     * @param hour an int
     * @param min an int
     * @param sec an int
     * otherwise:
     * @throws InvalidTimeError
     */

    public Time(int hour, int min, int sec) throws InvalidTimeError {
        if(this.validHour(hour))
            this.hour = hour;
        else throw new InvalidTimeError("Invalid Hour");
        if(this.validMin(min))
            this.min = min;
        else throw new InvalidTimeError("Invalid Minutes");
        if(this.validSec(sec))
            this.sec = sec;
        else throw new InvalidTimeError("Invalid Seconds");
    }

    /**
     * private helper function
     * @param hour/Min/Sec
     * @return a boolean type, true or false
     */
    private boolean validHour(int hour){
        return (hour <= 23 && hour >= 0);
    }
    private boolean validMin(int min){ return (min <= 59 && min >= 0);}
    private boolean validSec(int sec){
        return (sec <= 59 && sec >= 0);
    }

    /**
     * method to get time
     * @return a string
     */
    public String getTime(){
        return this.hour + ":" + this.min + ":" + this.sec;
    }


}
