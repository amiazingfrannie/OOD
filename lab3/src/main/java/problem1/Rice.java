package problem1;

public class Rice extends NonPerishableFoodItem {

  public Rice(String name, Double curUnitPrice, Integer curAvailableQuantity) {
    super(name, curUnitPrice, curAvailableQuantity);
  }

  @Override
  public String toString() {
    return "Rice{" +
        "name='" + name + '\'' +
        ", curUnitPrice=" + curUnitPrice +
        ", curAvailableQuantity=" + curAvailableQuantity +
        '}';
  }
}
