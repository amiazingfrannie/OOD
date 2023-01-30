package problem1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Objects;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * lab2:
 * class FoodItem equals() and hashCode() tested
 */
class FoodItemTest {

  private Rice testRice;
  private Meat testMeat;
  private Pasta testPasta;
  private String expectedName;
  private Double expectedUnitPrice;
  private Integer expectedQuantity;
  private LocalDate expectedOrderDate;
  private LocalDate expectedExpirationDate;


  @BeforeEach
  void setUp(){
    testRice = new Rice("Jasmine Rice", 2.79, 15);
    testMeat = new Meat("turkey", 7.99, 5, LocalDate.of(2023, 1, 26),
        LocalDate.of(2023, 2, 1));

    testPasta = new Pasta("Gnocchi", 2.99, 10);
  }

  @Test
  void getName_Rice() {
    expectedName = "Jasmine Rice";
    assertEquals(expectedName, testRice.getName());
  }

  @Test
  void getName_Meat() {
    expectedName = "turkey";
    assertEquals(expectedName, testMeat.getName());
  }

  @Test
  void getCurUnitPrice_Rice() {
    expectedUnitPrice = 2.79;
    assertEquals(expectedUnitPrice, testRice.getCurUnitPrice());
  }

  @Test
  void getCurUnitPrice_Meat() {
    expectedUnitPrice = 7.99;
    assertEquals(expectedUnitPrice, testMeat.getCurUnitPrice());
  }

  @Test
  void getCurAvailableQuantity() {
    expectedQuantity = 5;
    assertEquals(expectedQuantity, testMeat.getCurAvailableQuantity());
  }

  @Test
  void getOrderDate(){
    expectedOrderDate = LocalDate.of(2023, 1, 26);
    assertEquals(expectedOrderDate, testMeat.getOrderDate());
  }

  @Test
  void getExpirationDate(){
    expectedExpirationDate = LocalDate.of(2023, 2, 1);
    assertEquals(expectedExpirationDate, testMeat.getExpirationDate());
  }

  @Test
  void toString_Rice(){
    String expectedString = "Rice{" +
        "name='" + testRice.getName() + '\'' +
        ", curUnitPrice=" + testRice.getCurUnitPrice() +
        ", curAvailableQuantity=" + testRice.getCurAvailableQuantity() +
        '}';
    assertEquals(expectedString, testRice.toString());
  }

  @Test
  void toString_Pasta(){
    String expectedString = "Pasta{" +
        "name='" + testPasta.getName() + '\'' +
        ", curUnitPrice=" + testPasta.getCurUnitPrice() +
        ", curAvailableQuantity=" + testPasta.getCurAvailableQuantity() +
        '}';
    assertEquals(expectedString, testPasta.toString());
  }

  @Test
  void toString_Meat(){
    String expectedString = "Meat{" +
        "orderDate=" + testMeat.getOrderDate() +
        ", expirationDate=" + testMeat.getExpirationDate() +
        ", name='" + testMeat.getName() + '\'' +
        ", curUnitPrice=" + testMeat.getCurUnitPrice() +
        ", curAvailableQuantity=" + testMeat.getCurAvailableQuantity() +
        '}';
    assertEquals(expectedString, testMeat.toString());
  }

  @Test
  void testEquals_sameMemoryAddress() {
    assertTrue(testRice.equals(testRice));
  }

  @Test
  void testEquals_differentDataType() {
    int testNum = 6;
    assertFalse(testRice.equals(testNum));
  }

  @Test
  void testEquals_nullTest(){
    assertFalse(testRice.equals(null));
  }

  @Test
  void testEquals_differentObjectSameValue() {
    Rice otherRice = new Rice("Jasmine Rice", 2.79, 15);
    assertTrue(testRice.equals(otherRice));
  }

  @Test
  void testEquals_differentName() {
    Rice otherRice = new Rice("Rice", 2.79, 15);
    assertFalse(testRice.equals(otherRice));
  }

  @Test
  void testEquals_differentPrice() {
    Rice otherRice = new Rice("Jasmine Rice", 2.99, 15);
    assertFalse(testRice.equals(otherRice));
  }

  @Test
  void testEquals_differentQuantity(){
    Rice otherRice = new Rice("Jasmine Rice", 2.79, 20);
    assertFalse(testRice.equals(otherRice));
  }

  @Test
  void testHashCode() {
    int expectedHash = Objects.hash(testRice.getName(),
        testRice.getCurUnitPrice(), testRice.getCurAvailableQuantity());
    assertEquals(expectedHash, testRice.hashCode());
  }
}