package problem1;

import java.time.LocalDate;

public class Vegetable extends PerishableFoodItem{

  public Vegetable(String name, Double curUnitPrice, Integer curAvailableQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, curUnitPrice, curAvailableQuantity, orderDate, expirationDate);
  }

  @Override
  public String toString() {
    return "Vegetable{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        ", name='" + name + '\'' +
        ", curUnitPrice=" + curUnitPrice +
        ", curAvailableQuantity=" + curAvailableQuantity +
        '}';
  }
}
