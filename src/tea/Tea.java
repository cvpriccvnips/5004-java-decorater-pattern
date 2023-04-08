package tea;

/**
 * Abstract class for Tea.
 */
public abstract class Tea {
  protected Size size = Size.LARGE;
  protected String description = "Unknown Tea";

  /**
   * Get menu description of the tea.
   * @return a celsius temperature.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Set the size of tea.
   * @param size size of the tea.
   */
  public void setSize(Size size) {
    this.size = size;
  }

  /**
   * Get the size of tea.
   * @return Size of tea.
   */
  public Size getSize() {
    return this.size;
  }

  /**
   * Calculate the price of tea.
   * @return price of tea.
   */
  public abstract double price();
}
