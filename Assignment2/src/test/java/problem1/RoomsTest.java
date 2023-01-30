package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomsTest {

  private Rooms testRooms;
  private static final int MAX_OCCUPANCY = 4;
  private static final int NUM_GUESTS = 0;
  private static final double PRICE1 = 100.00;
  private static final double PRICE2 = -100.00;
  private static final int NEW_GUESTS = 3;

  @BeforeEach
  void setUp() throws IllegalBooking {
    testRooms = new Rooms(MAX_OCCUPANCY, PRICE1, NUM_GUESTS);
  }

  @Test
  void invalidPrice() {
    assertThrows(IllegalBooking.class, () -> new Rooms(MAX_OCCUPANCY, PRICE2, NUM_GUESTS));
  }

  @Test
  void getNumOfGuests() {
    int expectedNumOfGuests = 0;
    assertEquals(expectedNumOfGuests, testRooms.getNumOfGuests());
  }

  @Test
  void getMaxOccupancy() {
    int expectedMaxOccupancy = 4;
    assertEquals(expectedMaxOccupancy, testRooms.getMaxOccupancy());
  }

  @Test
  void isAvailable_TrueTest() {
    assertTrue(testRooms.isAvailable());
  }

  @Test
  void isAvailable_FalseTest() throws IllegalBooking {
    Rooms otherRoom = new Rooms(4, 100.00, 3);
    assertFalse(otherRoom.isAvailable());
  }

  @Test
  void bookRoom_Valid() throws IllegalBooking {
    int expectedNewGuests = 3;
    assertEquals(expectedNewGuests, testRooms.bookRoom(NEW_GUESTS));
  }

  @Test
  void bookRoom_Unavailable() throws IllegalBooking {
    Rooms otherRoom = new Rooms(4, 100.00, 3);
    assertThrows(IllegalBooking.class, () -> otherRoom.bookRoom(3));
  }

  @Test
  void bookRoom_NumOfGuestGreaterThanMax(){
    assertThrows(IllegalBooking.class, () -> testRooms.bookRoom(5));
  }

  @Test
  void bookRoom_NumOfGuestSmallerThan0(){
    assertThrows(IllegalBooking.class, () -> testRooms.bookRoom(-1));
  }


  @Test
  void testEquals_sameMemoryAddress() {
    assertTrue(testRooms.equals(testRooms));
  }

  @Test
  void testEquals_differentDataType() {
    int testNum = 6;
    assertFalse(testRooms.equals(testNum));
  }

  @Test
  void testEquals_nullTest(){
    assertFalse(testRooms.equals(null));
  }

  @Test
  void testEquals_differentObjectSameValue() throws IllegalBooking {
    Rooms otherRoom = new Rooms(4, 100.00, 0);
    assertTrue(testRooms.equals(otherRoom));
  }

  @Test
  void testEquals_differentMaxOccupancy() throws IllegalBooking {
    Rooms otherRoom = new Rooms(5, PRICE1, NUM_GUESTS);
    assertFalse(testRooms.equals(otherRoom));
  }

  @Test
  void testEquals_differentPrice() throws IllegalBooking {
    Rooms otherRoom = new Rooms(MAX_OCCUPANCY, 123.3, NUM_GUESTS);
    assertFalse(testRooms.equals(otherRoom));
  }

  @Test
  void testEquals_differentNumGuests() throws IllegalBooking {
    Rooms otherRoom = new Rooms(MAX_OCCUPANCY, PRICE1, 2);
    assertFalse(testRooms.equals(otherRoom));
  }

  @Test
  void testHashCode() {
    int expectedHash = Objects.hash(testRooms.getMaxOccupancy(),
                        testRooms.getPrice(), testRooms.getNumOfGuests());
    assertEquals(expectedHash, testRooms.hashCode());
  }
}