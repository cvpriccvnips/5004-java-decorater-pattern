package tea;

/**
 * Class for a Black Tea.
 */
public class BlackTea extends Tea {
    /**
     * Constructs a black tea
     *
     * @param size the black of tea.
     */
    public BlackTea(Size size) {
        description = "Hola you ordered a black tea";
        size = size; 
    }

    public double price() {
        return 4;
    }
}