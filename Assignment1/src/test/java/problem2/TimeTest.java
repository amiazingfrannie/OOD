package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    private Time testTime;
    int EXPECTED_HOUR = 7;
    int EXPECTED_MIN = 10;
    int EXPECTED_SEC = 26;

    @BeforeEach
    void setUp() throws InvalidTimeError {
        testTime = new Time(EXPECTED_HOUR, EXPECTED_MIN, EXPECTED_SEC);
    }

    @Test
    void testValidHour1(){
        int HOUR = -10;
        assertThrows(InvalidTimeError.class, () -> new Time(HOUR, EXPECTED_MIN, EXPECTED_SEC));
    }

    @Test
    void testValidHour2(){
        int HOUR = 40;
        assertThrows(InvalidTimeError.class, () -> new Time(HOUR, EXPECTED_MIN, EXPECTED_SEC));
    }
    @Test
    void testValidMin1(){
        int MIN = -10;
        assertThrows(InvalidTimeError.class, () -> new Time(EXPECTED_HOUR, MIN, EXPECTED_SEC));
    }

    @Test
    void testValidMin2(){
        int MIN = 100;
        assertThrows(InvalidTimeError.class, () -> new Time(EXPECTED_HOUR, MIN, EXPECTED_SEC));
    }
    @Test
    void testValidSec1(){
        int SEC = 100;
        assertThrows(InvalidTimeError.class, () -> new Time(EXPECTED_HOUR, EXPECTED_MIN, SEC));
    }

    @Test
    void testValidSec2(){
        int SEC = -10;
        assertThrows(InvalidTimeError.class, () -> new Time(EXPECTED_HOUR, EXPECTED_MIN, SEC));
    }

    @Test
    void getTime() {
        String EXPECTED_TIME = EXPECTED_HOUR + ":" + EXPECTED_MIN + ":" + EXPECTED_SEC;
        assertEquals(EXPECTED_TIME, testTime.getTime());
    }
}


    /**
     * Question 1: @beforeEach is it necessary?  x
     * Question 2: p2 requires to return a Time object, how to test it? with asssertEqual, it'll report error
     *             assertEquals(EXPECTED_TIME, delivery.getDuration());
     *             -- in Delivery class
     * Question 3: setTime is defined in Time class, but every time initialing Time, need HOUR, MIN, SEC, then what's
     *             the point of defining setTime? but without it, how to validate the input?
     *             put conditions in constructor?
     * @throws InvalidHourError
     */