package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameTest {

  private Name testName;
  private static final String FIRST_NAME = "Fran";
  private static final String LAST_NAME = "Chan";
  private static final String MID_NAME = "Lee";

  @BeforeEach
  void setUp() {
    testName = new Name(FIRST_NAME, MID_NAME, LAST_NAME);
  }

  @Test
  void getFirstName() {
    assertEquals(FIRST_NAME, testName.getFirstName());
  }

  @Test
  void getMiddleName() {
    assertEquals(MID_NAME, testName.getMiddleName());
  }

  @Test
  void getLastName() {
    assertEquals(LAST_NAME, testName.getLastName());
  }

  @Test
  void testEquals_sameMemoryAddress() {
    assertTrue(testName.equals(testName));
  }

  @Test
  void testEquals_differentDataType() {
    int testNumber = 1;
    assertFalse(testName.equals(testNumber));
  }

  @Test
  void testEquals_nullTest(){
    assertFalse(testName.equals(null));
  }

  @Test
  void testEquals_differentObjectSameValue(){
    Name otherName = new Name("Fran", "Lee", "Chan");
    assertTrue(testName.equals(otherName));
  }

  @Test
  void testEquals_differentObjectDiffFirst(){
    Name otherName = new Name("F", "Lee", "Chan");
    assertFalse(testName.equals(otherName));
  }

  @Test
  void testEquals_differentObjectDiffMid(){
    Name otherName = new Name("Fran", "L", "Chan");
    assertFalse(testName.equals(otherName));
  }

  @Test
  void testEquals_differentObjectDiffLast(){
    Name otherName = new Name("Fran", "Lee", "C");
    assertFalse(testName.equals(otherName));
  }

  @Test
   void testHashCode() {
    int expectedHash = Objects.hash(testName.getFirstName(), testName.getMiddleName(), testName.getLastName());
    assertEquals(expectedHash, testName.hashCode());
  }

}