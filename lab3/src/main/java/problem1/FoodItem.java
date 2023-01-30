package problem1;

import java.util.Objects;

public abstract class FoodItem {

  protected String name;
  protected Double curUnitPrice;
  protected Integer curAvailableQuantity;

  public FoodItem(String name, Double curUnitPrice, Integer curAvailableQuantity) {
    this.name = name;
    this.curUnitPrice = curUnitPrice;
    this.curAvailableQuantity = curAvailableQuantity;
  }

  public String getName() {
    return name;
  }

  public Double getCurUnitPrice() {
    return curUnitPrice;
  }

  public Integer getCurAvailableQuantity() {
    return curAvailableQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoodItem foodItem = (FoodItem) o;
    return Objects.equals(name, foodItem.name) && Objects.equals(curUnitPrice,
        foodItem.curUnitPrice) && Objects.equals(curAvailableQuantity,
        foodItem.curAvailableQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, curUnitPrice, curAvailableQuantity);
  }
}
