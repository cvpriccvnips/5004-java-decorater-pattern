package tea;

public class Main {
  public static void main(String[] args) {
    Tea bubbleTea = new BubbleTea(Size.LARGE);
    bubbleTea = new TapiocaTopping(bubbleTea);

    System.out.println("You ordered: " + bubbleTea.getDescription());
    System.out.println("Total price: $" + bubbleTea.price());
  }
}
