package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleRoomTest {

  private static final int MAX_OCCUPANCY = 1;
  private static final int NUM_OF_GUESTS = 0;
  private static final double PRICE = 100.00;

  private SingleRoom testSingleRoom;

  @BeforeEach
  void setUp() throws IllegalBooking {
    testSingleRoom = new SingleRoom(MAX_OCCUPANCY, PRICE, NUM_OF_GUESTS);
  }
  @Test
  void testInvalidMaxOccupancy() {
    int maxOccupancy = 2;
    assertThrows(IllegalBooking.class, ()-> new SingleRoom(maxOccupancy, PRICE, NUM_OF_GUESTS));
  }

//  @Test
//  void isAvailable() {
//    assertTrue(testSingleRoom.isAvailable());
//  }
//
//  @Test
//  void bookRoom() throws IllegalBooking {
//    int expectedGuests = 1;
//    int newGuest = 1;
//    assertEquals(expectedGuests, testSingleRoom.bookRoom(newGuest));
//  }
//
//  @Test
//  void bookRoom_Invalid() {
//    int newGuest = 2;
//    assertThrows(IllegalBooking.class, ()-> testSingleRoom.bookRoom(newGuest));
//  }

}