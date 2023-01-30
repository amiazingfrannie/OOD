package problem1;

public abstract class NonPerishableFoodItem extends FoodItem {

  protected static final Integer MAX_ALLOWED_QUANTITY = 250;

  public NonPerishableFoodItem(String name, Double curUnitPrice, Integer curAvailableQuantity) {
    super(name, curUnitPrice, curAvailableQuantity);
  }
}
