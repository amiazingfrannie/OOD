package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FamilyRoomTest {
  private static final int MAX_OCCUPANCY = 4;
  private static final int NUM_OF_GUESTS = 0;
  private static final double PRICE = 100.00;
  private FamilyRoom testFamilyRoom;

  @BeforeEach
  void setUp() throws IllegalBooking {
    testFamilyRoom = new FamilyRoom(MAX_OCCUPANCY, PRICE, NUM_OF_GUESTS);
  }

  @Test
  void testInvalidMaxOccupancy() {
    int maxOccupancy = 5;
    assertThrows(IllegalBooking.class, ()-> new FamilyRoom(maxOccupancy, PRICE, NUM_OF_GUESTS));
  }

//  @Test
//  void isAvailable() {
//    assertTrue(testFamilyRoom.isAvailable());
//  }
//
//  @Test
//  void bookRoom() throws IllegalBooking {
//    int expectedGuests = 4;
//    int newGuest = 4;
//    assertEquals(expectedGuests, testFamilyRoom.bookRoom(newGuest));
//  }
//
//  @Test
//  void bookRoom_Invalid() {
//    int newGuest = 6;
//    assertThrows(IllegalBooking.class, ()-> testFamilyRoom.bookRoom(newGuest));
//  }
}