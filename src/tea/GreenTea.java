package tea;

/**
 * Class for a Green Tea.
 */
public class GreenTea extends Tea {
    /**
     * Constructs a green tea
     *
     * @param size the size of tea.
     */
    public GreenTea(Size size) {
        this.description = "Hello you ordered our brand new green tea";
        this.size = size; 
    }
    
    /**
     * Get the price of tea.
     */
    @Override
    public double price() {
        return 4.5;
    }
}
