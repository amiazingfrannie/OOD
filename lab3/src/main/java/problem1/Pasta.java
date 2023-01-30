package problem1;

public class Pasta extends NonPerishableFoodItem {

  public Pasta(String name, Double curUnitPrice, Integer curAvailableQuantity) {
    super(name, curUnitPrice, curAvailableQuantity);
  }

  @Override
  public String toString() {
    return "Pasta{" +
        "name='" + name + '\'' +
        ", curUnitPrice=" + curUnitPrice +
        ", curAvailableQuantity=" + curAvailableQuantity +
        '}';
  }
}
