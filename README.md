# Decorater-pattern-group3

Team Member: Judy Wang, Lu Yan, Jinda Zhang

## Introduction

The Decorator Pattern is a structural design pattern that allows objects to be dynamically extended with new functionality at runtime without affecting the behavior of existing objects. It is is sometimes referred to as the "Wrapper" pattern, as it involves wrapping an object with one or more decorators that provide additional functionality. To implement the pattern, a decorator must implement the same interface as the wrapped object, which allows the client to treat them as identical objects. This approach enables the addition of new features and behaviors to an object without modifying its existing code, resulting in a flexible, modular, and easily maintainable codebase.

This follows the principle that code should be open for extension but closed for modification. Additionally, the Decorator Pattern follows the Single Responsibility Principle, as the decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job. 

The Decorator Pattern is used when you want to add behavior to an individual object, without affecting the behavior or structure of other objects from the same class. This pattern is widely used in GUI toolkits, where you can add various decorations to widgets, such as borders, shadows, and backgrounds.

![image](https://user-images.githubusercontent.com/70824612/229972235-1889ad5f-99b9-48d9-a6a5-a342527675ef.png)

## Application (When to use it?)
The Decorator Pattern is used when you want to add or remove functionality to an object without affecting other instances of the same object. It is useful in situations where it is impractical to subclass every possible combination of attributes for an object.

A common example of the Decorator Pattern is in the creation of graphical user interfaces. Many graphical user interface frameworks use decorators to add functionality to basic widgets such as buttons and text boxes. By using decorators, the framework can dynamically add functionality to a widget at runtime.

Another common example of the Decorator Pattern is in the creation of coffee drinks. In this example, the base drink (e.g. espresso) is decorated with additional ingredients (e.g. milk, sugar, flavorings) to create a custom drink.

## UML Class Diagram

![image](https://user-images.githubusercontent.com/70824612/230707749-f8da5999-d98f-41ec-b231-d010e1ecfe71.png)

## Code Walkthrough

In our real-world project Tea implementing decorater pattern, we start with declearing abstract class Tea.
```
package tea;

/**
 * Abstract class for Tea.
 */
public abstract class Tea {
  Size size = Size.LARGE;
  String description = "Unknown Tea";

  /**
   * Get menu description of the tea.
   * @return a celsius temperature.
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Set the size of tea.
   * @param size size of the tea.
   */
  public void setSize(Size size) {
    this.size = size;
  }

  /**
   * Get the size of tea.
   * @return Size of tea.
   */
  public Size getSize() {
    return this.size;
  }

  /**
   * Calculate the price of tea.
   * @return price of tea.
   */
  public abstract double price();
}
```
Tea.java has three methods:

getDescription(): This method returns a String value which is the description of the tea.

setSize(): This method sets the size of the tea to the passed parameter.

getSize(): This method returns the current size of the tea.

The class has an abstract method price(), which returns the price of the tea. This method is abstract because the price of the tea will depend on the specific type of tea that extends this class.


## How to Run It?

To get started with this project, you will need to have Java installed on your system. You can clone this repository and open the project in your favorite Java IDE.

Once you have the project open, you can run the Main driver to see an example of how the Decorator Pattern can be used to order a tea with different sizes and toppings.

For example, in Intellij Idea, click run button in src/tea/Main.java

![image](https://user-images.githubusercontent.com/70824612/230707585-8543551c-f2d3-4c33-bf75-f66e6af8b81b.png)


Output:

![image](https://user-images.githubusercontent.com/70824612/230707431-92d11fa0-34dd-4926-842d-4d0d6f0335d6.png)


## Reference
- Head first design patterns : building extensible and maintainable object-oriented software
Freeman, Eric, 1965- author.; Robson, Elisabeth, author. Sebastopol, California : O'Reilly 2021
- Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional.
- https://en.wikipedia.org/wiki/Decorator_pattern
