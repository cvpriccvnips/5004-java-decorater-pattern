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
        description = "Hello you ordered our brand new green tea";
        size = size; 
    }

    public double price() {
        return 4.5;
    }
}