package problem2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosnTest {

  private Posn testPosn;
  private Integer X = 10;
  private Integer Y = 20;

  @BeforeEach
  void setUp() {
    testPosn = new Posn(X, Y);
  }

  @Test
  void getX() {assertEquals(X, testPosn.getX());}

  @Test
  void getY() {assertEquals(Y, testPosn.getY());}

  @Test
  void testEquals_sameMemoryAddr() {assertTrue(testPosn.equals(testPosn));}

  @Test
  void testEquals_sameDataType() {
    int testNumber = 0;
    assertFalse(testPosn.equals(testNumber));
  }

  /**
   * testPosn X, Y both NOT NULL
   */
  @Test
  void testEquals_notNullTest() {
    assertFalse(testPosn.equals(null));
  }

  /**
   * testPosn x not null
   */
  @Test
  void testEquals_notNullXTest() {
    assertFalse(testPosn.getX().equals(null));
  }
  /**
   * testPosn y not null
   */
  @Test
  void testEquals_notNullYTest() {
    assertFalse(testPosn.getY().equals(null));
  }
  /**
   * other x null
   */
  @Test
  void testEquals_nullXTest() {
    Posn otherPosn = new Posn(null, 10);
    assertFalse(otherPosn.equals(testPosn));
  }

  /**
   * other y null
   */
  @Test
  void testEquals_nullYTest() {
    Posn otherPosn = new Posn(10, null);
    assertFalse(otherPosn.equals(testPosn));
  }

  /**
   * other y null, getY() == null
   */
  @Test
  void testEquals_getYTest() {
    Posn otherPosn = new Posn(10, null);
    assertFalse(testPosn.getY().equals(otherPosn.getY()));
  }
  /**
   * other x null, getX() == null
   */
  @Test
  void testEquals_getXTest() {
    Posn otherPosn = new Posn(null, 10);
    assertFalse(testPosn.getX().equals(otherPosn.getX()));
  }

  /**
   * other x is not null
   */
  @Test
  void testEquals_sameXTest() {
    Posn otherPosn = new Posn(10, 10);
    assertTrue(testPosn.getX().equals(otherPosn.getX()));
  }

  @Test
  void testEquals_sameYTest() {
    Posn otherPosn = new Posn(5, 20);
    assertTrue(testPosn.getY().equals(otherPosn.getY()));
  }

  @Test
  void testEquals_sameObjectValueY() {
    Posn otherPosn = new Posn(10, 20);
    assertTrue(testPosn.equals(otherPosn));
  }

  @Test
  void testEquals_diffObjectValueX() {
    Posn otherPosn = new Posn(5, 20);
    assertFalse(testPosn.getX().equals(otherPosn.getX()));
  }

  @Test
  void testEquals_diffObjectValueY() {
    Posn otherPosn = new Posn(10, 27);
    assertFalse(testPosn.getY().equals(otherPosn.getX()));
  }

  /**
   * test hashCode()
   */
  @Test
  void testHashCode_notNullXY() {
    int expectedHash = testPosn.getX().hashCode()*31 + testPosn.getY().hashCode();
    assertEquals(expectedHash, testPosn.hashCode());
  }

  @Test
  void testHashCode_nullXNotNullY() {
    Posn otherPosn = new Posn(null, 20);
    int expectedHash = 0 + otherPosn.getY().hashCode();
    assertEquals(expectedHash, otherPosn.hashCode());
  }

  @Test
  void testHashCode_NotNullXNullY(){
    Posn otherPosn = new Posn(10, null);
    int expectedHash = otherPosn.getX().hashCode()*31 + 0;
    assertEquals(expectedHash, otherPosn.hashCode());
  }

  @Test
  void testHashCode_nullXY(){
    Posn otherPosn = new Posn(null, null);
    int expectedHash = 0;
    assertEquals(expectedHash, otherPosn.hashCode());
  }

}