package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem1.IllegalBooking;
import problem1.Rooms;

/**
 * Recipient, Mail and Locker all tested in this file
 */
class LockerTest {

  private static final int WIDTH = 3;
  private static final int HEIGHT = 6;
  private static final int DEPTH = 3;

  private static final String FIRST_NAME = "FRAN";
  private static final String LAST_NAME = "CHAN";
  private static final String EMAIL = "FRAN@neu.org";

  private static final int MAX_WIDTH = 15;
  private static final int MAX_HEIGHT = 25;
  private static final int MAX_DEPTH = 15;

  private Recipient testRecipient;
  private Mail testMail;
  private Locker testLocker;

  @BeforeEach
  void setUp() throws InvalidMailException {
    testRecipient = new Recipient(FIRST_NAME, LAST_NAME, EMAIL);
    testMail = new Mail(WIDTH, HEIGHT, DEPTH, testRecipient);
    testLocker = new Locker(MAX_WIDTH, MAX_HEIGHT, MAX_DEPTH, testMail);
    /**
     * Test Mail class -- via setter
     */
    assertThrows(InvalidMailException.class, ()-> new Mail(1, HEIGHT, DEPTH, testRecipient));
    assertThrows(InvalidMailException.class, ()-> new Mail(WIDTH, 1, DEPTH, testRecipient));
    assertThrows(InvalidMailException.class, ()-> new Mail(WIDTH, HEIGHT, 0, testRecipient));

    /**
     * Test Locker class
     */
    assertThrows(InvalidMailException.class, ()-> new Locker(5, MAX_HEIGHT, MAX_DEPTH, testMail));
    assertThrows(InvalidMailException.class, ()-> new Locker(MAX_WIDTH, 5, MAX_DEPTH, testMail));
    assertThrows(InvalidMailException.class, ()-> new Locker(MAX_WIDTH, MAX_HEIGHT, 5, testMail));
  }

  @Test
  void addMail() throws InvalidMailException {
    /**
     * addMail first time
     */
    testLocker.addMail(testMail);
    assertEquals(testMail, testLocker.getMail());
    /**
     * exception test: add mail again
     */
    assertThrows(InvalidMailException.class, ()-> testLocker.addMail(testMail));
  }

  @Test
  void addMail_InvalidWidth() throws InvalidMailException {
    Mail otherMail = new Mail(20, HEIGHT, DEPTH, testRecipient);
    assertThrows(InvalidMailException.class, () -> testLocker.addMail(otherMail));
  }

  @Test
  void addMail_InvalidHeight() throws InvalidMailException {
    Mail otherMail = new Mail(WIDTH, 30, DEPTH, testRecipient);
    assertThrows(InvalidMailException.class, () -> testLocker.addMail(otherMail));
  }
  @Test
  void addMail_InvalidDepth() throws InvalidMailException {
    Mail otherMail = new Mail(WIDTH, HEIGHT, 40, testRecipient);
    assertThrows(InvalidMailException.class, () -> testLocker.addMail(otherMail));
  }

  @Test
  void pickupMail_Null() {
    assertThrows(InvalidMailException.class, ()-> testLocker.pickupMail(testRecipient));
  }

  @Test
  void pickupMail_MatchingRecipient() throws InvalidMailException {
    testLocker.addMail(testMail);
    assertEquals(testMail, testLocker.pickupMail(testRecipient));
    assertTrue(testLocker.getMail() == null);
  }

  @Test
  void pickupMail_NoMatchingRecipient() throws InvalidMailException {
    Recipient otherRecipient = new Recipient("F", "chan", "email");
    testLocker.addMail(testMail);
    assertThrows(InvalidMailException.class, () -> testLocker.pickupMail(otherRecipient));
  }

  /**
   * test initial if value of Mail in Locker is null
   */
  @Test
  void getMail() {
    assertTrue(testLocker.getMail() == null);
  }

  @Test
  void testEquals_sameMemoryAddress() {
    assertTrue(testLocker.equals(testLocker));
  }

  @Test
  void testEquals_differentDataType() {
    int testNum = 6;
    assertFalse(testLocker.equals(testNum));
  }

  @Test
  void testEquals_nullTest(){ assertFalse(testLocker.equals(null));}

  @Test
  void testEquals_differentObjectSameValue() throws InvalidMailException {
    Locker otherLocker = new Locker(15, 25, 15, testMail);
    assertTrue(testLocker.equals(otherLocker));
  }

  @Test
  void testEquals_differentMaxW() throws InvalidMailException {
    Locker otherLocker = new Locker(40, MAX_HEIGHT, MAX_DEPTH, testMail);
    assertFalse(testLocker.equals(otherLocker));
  }

  @Test
  void testEquals_differentMaxH() throws InvalidMailException {
    Locker otherLocker = new Locker(MAX_WIDTH, 29, MAX_DEPTH, testMail);
    assertFalse(testLocker.equals(otherLocker));
  }

  @Test
  void testEquals_differentMaxD() throws InvalidMailException {
    Locker otherLocker = new Locker(MAX_WIDTH, MAX_HEIGHT,20, testMail);
    assertFalse(testLocker.equals(otherLocker));
  }

  @Test
  void testEquals_differentMail() throws InvalidMailException {
    Mail otherMail = new Mail(2, 4, 2, testRecipient);
    Locker otherLocker = new Locker(MAX_WIDTH, MAX_HEIGHT,MAX_DEPTH, otherMail);
    assertTrue(testLocker.equals(otherLocker));
  }

  @Test
  void testEquals_SameMail() throws InvalidMailException {
    Mail otherMail = new Mail(2, 4, 2, testRecipient);
    Locker otherLocker = new Locker(MAX_WIDTH, MAX_HEIGHT,MAX_DEPTH, otherMail);
    otherLocker.addMail(otherMail);
    assertFalse(testLocker.equals(otherLocker));
  }

  @Test
  void testHashCode() {
    int expectedHash = Objects.hash(testLocker.getMaxWidth(), testLocker.getMaxHeight(),
                        testLocker.getMaxDepth(), testLocker.getMail());
    assertEquals(expectedHash, testLocker.hashCode());
  }

  @Test
  void testToString_Recipient(){
    String expectedString = "Recipient{" +
        "firstName='" + testRecipient.getFirstName() + '\'' +
        ", lastName='" + testRecipient.getLastName() + '\'' +
        ", emailAddr='" + testRecipient.getEmailAddr() + '\'' +
        '}';
    assertEquals(expectedString, testRecipient.toString());
  }

  @Test
  void testToString_Mail(){
    String expectedString = "Mail{" +
        "width=" + testMail.getWidth() +
        ", height=" + testMail.getHeight() +
        ", depth=" + testMail.getDepth()+
        ", recipient=" + testMail.getRecipient() +
        '}';
    assertEquals(expectedString, testMail.toString());
  }



}