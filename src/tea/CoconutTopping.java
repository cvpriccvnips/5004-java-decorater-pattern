package tea;

/**
 * Class for adding Tapio topping to tea.
 */
public class CoconutTopping extends ToppingDecorator {
  /**
   * Constructs CoconutTopping for the tea.
   *
   * @param tea tea that we want to add coconut topping.
   */
  public CoconutTopping(Tea tea) {
    this.tea = tea;
  }

  public String getDescription() {
    return tea.getDescription() + ", you added fresh Coconut";
  }

  /**
   * Calculate the price of tea.
   *
   * @return price of tea.
   */
  @Override
  public double price() {
    double price = tea.price();
    if (tea.getSize() == Size.REGULAR) {
      price += 1.0;
    } else if (tea.getSize() == Size.LARGE) {
      price += 1.5;
    } else if (tea.getSize() == Size.EXTRA_LARGE) {
      price += 2.0;
    }
    return price;
  }
}
