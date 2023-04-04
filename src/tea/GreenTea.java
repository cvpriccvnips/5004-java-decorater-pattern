package tea;

public class GreenTea extends Tea {
    public GreenTea(Size size) {
        description = "GreenTea";
        size = size; 
    }

    public double price() {
        return 4.5;
    }
}