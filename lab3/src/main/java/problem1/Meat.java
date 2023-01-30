package problem1;

import java.time.LocalDate;

public class Meat extends PerishableFoodItem{

  public Meat(String name, Double curUnitPrice, Integer curAvailableQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, curUnitPrice, curAvailableQuantity, orderDate, expirationDate);
  }

  @Override
  public String toString() {
    return "Meat{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        ", name='" + name + '\'' +
        ", curUnitPrice=" + curUnitPrice +
        ", curAvailableQuantity=" + curAvailableQuantity +
        '}';
  }
}
