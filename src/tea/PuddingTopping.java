package tea;

/**
 * Class for adding Tapio topping to tea.
 */
public class PuddingTopping extends ToppingDecorator {
  /**
   * Constructs PuddingTopping for the tea.
   *
   * @param tea tea that we want to add pudding topping.
   */
  public PuddingTopping(Tea tea) {
    this.tea = tea;
  }

  public String getDescription() {
    return tea.getDescription() + ", you added Pudding";
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
      price += 0.8;
    } else if (tea.getSize() == Size.LARGE) {
      price += 1.3;
    } else if (tea.getSize() == Size.EXTRA_LARGE) {
      price += 1.8;
    }
    return price;
  }
}
