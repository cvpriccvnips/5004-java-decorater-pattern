package tea;

/**
 * Class for adding Tapio topping to tea.
 */
public class RedBeanTopping extends ToppingDecorator {
    /**
     * Constructs RedBeanTopping for the tea.
     *
     * @param tea tea that we want to add red bean topping.
     */
    public RedBeanTopping(Tea tea) {
        this.tea = tea;
    }

    public String getDescription() {
        return tea.getDescription() + ", you added RedBean";
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
            price += 0.7;
        } else if (tea.getSize() == Size.LARGE) {
            price += 0.9;
        } else if (tea.getSize() == Size.EXTRA_LARGE) {
            price += 1.1;
        }
        return price;
    }
}
