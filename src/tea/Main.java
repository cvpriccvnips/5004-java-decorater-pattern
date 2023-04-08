package tea;

public class Main {
  public static void main(String[] args) {
    Tea greenTea = new GreenTea(Size.LARGE);
    greenTea = new TapiocaTopping(greenTea);

    System.out.println("You ordered: " + greenTea.getDescription());
    System.out.println("Total price: $" + greenTea.price());
  }
}
