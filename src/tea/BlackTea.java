package tea;

/**
 * Class for a Black Tea.
 */
public class BlackTea extends Tea {
    /**
     * Constructs a black tea.
     *
     * @param size the black tea.
     */
    public BlackTea(Size size) {
        this.description = "Hola you ordered a black tea";
        this.size = size; 
    }
    
    /**
     * Get the price of tea.
     */
    @Override
    public double price() {
        return 4;
    }
}
