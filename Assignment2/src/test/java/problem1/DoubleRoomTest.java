package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoubleRoomTest {
  private static final int MAX_OCCUPANCY = 2;
  private static final int NUM_OF_GUESTS = 0;
  private static final double PRICE = 100.00;
  private DoubleRoom testDoubleRoom;

  @BeforeEach
  void setUp() throws IllegalBooking {
    testDoubleRoom = new DoubleRoom(MAX_OCCUPANCY, PRICE, NUM_OF_GUESTS);
  }

  @Test
  void testInvalidMaxOccupancy() {
    int maxOccupancy = 3;
    assertThrows(IllegalBooking.class, ()-> new DoubleRoom(maxOccupancy, PRICE, NUM_OF_GUESTS));
  }

//  @Test
//  void isAvailable() {
//    assertTrue(testDoubleRoom.isAvailable());
//  }
//
//  @Test
//  void bookRoom() throws IllegalBooking {
//    int expectedGuests = 2;
//    int newGuest = 2;
//    assertEquals(expectedGuests, testDoubleRoom.bookRoom(newGuest));
//  }
//
//  @Test
//  void bookRoom_Invalid() {
//    int newGuest = 4;
//    assertThrows(IllegalBooking.class, ()-> testDoubleRoom.bookRoom(newGuest));
//  }
}