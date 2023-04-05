package tea;

/**
 * Class for adding Tapio topping to tea.
 */
public class TapiocaTopping extends ToppingDecorator {
    /**
     * Constructs RedBeanTopping for the tea.
     *
     * @param tea tea that we want to add tapioca topping.
     */
    public TapiocaTopping(Tea tea) {
        this.tea = tea;
    }

    public String getDescription() {
        return tea.getDescription() + ", you added Tapioca";
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
            price += 1;
        } else if (tea.getSize() == Size.LARGE) {
            price += 2;
        } else if (tea.getSize() == Size.EXTRA_LARGE) {
            price += 3;
        }
        return price;
    }
}
