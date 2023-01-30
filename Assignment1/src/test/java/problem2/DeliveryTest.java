package problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {

    private static final int START_HOUR = 5;
    private static final int START_MIN= 10;
    private static final int START_SEC = 12;
    private static final int END_HOUR = 15;
    private static final int END_MIN = 24;
    private static final int END_SEC = 44;

    Time startTime = new Time(START_HOUR, START_MIN, START_SEC);
    Time endTime = new Time(END_HOUR, END_MIN, END_SEC);
    Delivery delivery = new Delivery("Denny Way", "MK RD", startTime, endTime);;

    DeliveryTest() throws InvalidTimeError {
    }

    @Test
    void getDuration() throws InvalidTimeError {
        int EXPECTED_HOUR = 10;
        int EXPECTED_MIN = 14;
        int EXPECTED_SEC = 32;
        assertEquals(EXPECTED_HOUR, delivery.getDuration().hour);
        assertEquals(EXPECTED_MIN, delivery.getDuration().min);
        assertEquals(EXPECTED_SEC, delivery.getDuration().sec);
    }

//    @Test
//    void getDuration1(){
//        Time EXPECTED_TIME = new Time(10, 14, 32);
//        assertEquals(EXPECTED_TIME, delivery.getDuration());
//    }

    @Test
    void getStartLoc() {
        String EXPECTED_START_LOC = "Denny Way";
        assertEquals(EXPECTED_START_LOC, delivery.getStartLoc());
    }

    @Test
    void getEndLoc() {
        String EXPECTED_END_LOC = "MK RD";
        assertEquals(EXPECTED_END_LOC, delivery.getEndLoc());
    }
}