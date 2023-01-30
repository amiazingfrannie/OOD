package problem1;

import java.time.LocalDate;

public class Fruit extends PerishableFoodItem {

  public Fruit(String name, Double curUnitPrice, Integer curAvailableQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, curUnitPrice, curAvailableQuantity, orderDate, expirationDate);
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        ", name='" + name + '\'' +
        ", curUnitPrice=" + curUnitPrice +
        ", curAvailableQuantity=" + curAvailableQuantity +
        '}';
  }
}
