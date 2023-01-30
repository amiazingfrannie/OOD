package problem1;

import java.time.LocalDate;
import java.util.Objects;

public abstract class PerishableFoodItem extends FoodItem {

  protected LocalDate orderDate;
  protected LocalDate expirationDate;
  protected static final Integer MAX_ALLOWED_QUANTITY = 100;

  public PerishableFoodItem(String name, Double curUnitPrice, Integer curAvailableQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, curUnitPrice, curAvailableQuantity);
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    PerishableFoodItem that = (PerishableFoodItem) o;
    return Objects.equals(orderDate, that.orderDate) && Objects.equals(
        expirationDate, that.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), orderDate, expirationDate);
  }
}
