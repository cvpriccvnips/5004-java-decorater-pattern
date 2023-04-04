package tea;

public class BubbleTea extends Tea {
    public BubbleTea(Size size) {
        description = "BubbleTea";
        size = size; 
    }

    public double price() {
        return 5.5;
    }
}