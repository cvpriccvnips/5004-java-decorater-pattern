package tea;

public class BlackTea extends Tea {
    public BlackTea(Size size) {
        description = "BlackTea";
        size = size; 
    }

    public double price() {
        return 4;
    }
}