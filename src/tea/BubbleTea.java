package tea;

/**
 * Class for a Bubble Tea.
 */
public class BubbleTea extends Tea {
    /**
     * Constructs a Bubble tea
     *
     * @param size the size of tea.
     */
    public BubbleTea(Size size) {
        description = "Bonjour you ordered a bubble tea";
        size = size; 
    }

    /**
     * Get the price of tea.
     */
    @Override
    public double price() {
        return 5.5;
    }
}
