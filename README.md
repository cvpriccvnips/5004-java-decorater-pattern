# Decorater-pattern-group3

Team Member: Judy Wang, Lu Yan, Jinda Zhang

## Introduction

The Decorator Pattern is a structural design pattern that allows objects to be dynamically extended with new functionality at runtime without affecting the behavior of existing objects. It is is sometimes referred to as the "Wrapper" pattern, as it involves wrapping an object with one or more decorators that provide additional functionality. To implement the pattern, a decorator must implement the same interface as the wrapped object, which allows the client to treat them as identical objects. This approach enables the addition of new features and behaviors to an object without modifying its existing code, resulting in a flexible, modular, and easily maintainable codebase.

This follows the principle that code should be open for extension but closed for modification. Additionally, the Decorator Pattern follows the Single Responsibility Principle, as the decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job.

The Decorator Pattern is used when you want to add behavior to an individual object, without affecting the behavior or structure of other objects from the same class. This pattern is widely used in GUI toolkits, where you can add various decorations to widgets, such as borders, shadows, and backgrounds.

![image](https://user-images.githubusercontent.com/70824612/229972235-1889ad5f-99b9-48d9-a6a5-a342527675ef.png)

## Application (When to use it?)
The Decorator Pattern is commonly used in the following scenarios:

- When you want to add or remove functionality to an object without affecting other instances of the same object, especially when it's impractical to create a subclass for every possible combination of attributes.

- When you can't extend an object's behavior using inheritance, such as when the object is final and can't be subclassed. In this case, you can wrap the object with a decorator to add functionality.

One popular use of the Decorator Pattern is in graphical user interface frameworks, where decorators are used to add functionality to basic widgets like buttons and text boxes at runtime.

Another common use of the Decorator Pattern is in coffee shops, where customers can customize their drinks by adding extra ingredients like milk, sugar, and flavorings to a base drink like espresso.

By using the Decorator Pattern, you can add functionality to objects dynamically and in a flexible way, without having to modify their underlying implementation or create complex inheritance hierarchies.

## UML Class Diagram

![image](https://user-images.githubusercontent.com/70824612/230707749-f8da5999-d98f-41ec-b231-d010e1ecfe71.png)

## Code Walkthrough

In our real-world project Tea implementing decorater pattern, we start with declearing abstract class Tea.
```java
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

In Size.java:
```java
public enum Size {
  REGULAR,
  LARGE,
  EXTRA_LARGE;
}
```
This is an enumeration class called Size that defines three constant values: REGULAR, LARGE, and EXTRA_LARGE. These values represent the different sizes that a tea can have.

In an example of concrete class GreenTea.java,
```java
public class GreenTea extends Tea {
    public GreenTea(Size size) {
        description = "Hello you ordered our brand new green tea";
        size = size; 
    }
    
    @Override
    public double price() {
        return 4.5;
    }
}
```
The class has a constructor that takes the size parameter and sets the description property to a string that indicates the type of tea being ordered, and also sets the size property of the tea.

In ToppingDecorator.java:
```java
public abstract class ToppingDecorator extends Tea {
  public Tea tea;
  public abstract String getDescription();

  public Size getSize() {
    return tea.getSize();
  }
}
```

The ToppingDecorator class has two variables: a Tea object and an abstract method called getDescription(). The Tea object is used to keep track of the tea that is being decorated. The getDescription() method will be implemented by any class that extends ToppingDecorator, and it will be used to provide a description of the topping. This class has a getSize() method that returns the size of the tea being decorated. This method is important because the cost of the topping will be calculated based on the size of the tea.

In an example of concrete class CoconutTopping.java,
```java
public class CoconutTopping extends ToppingDecorator {
  public CoconutTopping(Tea tea) {
    this.tea = tea;
  }

  public String getDescription() {
    return tea.getDescription() + ", you added fresh Coconut";
  }

  @Override
  public double price() {
    double price = tea.price();
    if (tea.getSize() == Size.REGULAR) {
      price += 1.0;
    } else if (tea.getSize() == Size.LARGE) {
      price += 1.5;
    } else if (tea.getSize() == Size.EXTRA_LARGE) {
      price += 2.0;
    }
    return price;
  }
}
```
The class has a constructor that takes a Tea object and assigns it to the tea instance variable. It also has an implementation of the getDescription() method, which returns the description of the tea object passed to it, concatenated with the string ", you added fresh Coconut" to indicate the addition of coconut topping. It overrides the price() method of the Tea abstract class, and calculates the price of the tea by calling the price() method of the tea object passed to it and then adding an additional cost for the coconut topping based on the size of the tea. If the size is REGULAR, the price is increased by 1.0, if it is LARGE, it is increased by 1.5, and if it is EXTRA_LARGE, it is increased by 2.0.



## How to Run It?

To get started with this project, you will need to have Java 11 installed on your system. You can clone this repository and open the project in your favorite Java IDE.

Once you have the project open, you can run the Main driver to see an example of how the Decorator Pattern can be used to order a tea with different sizes and toppings.

For example, in Intellij Idea, click run button in src/tea/Main.java

![image](https://user-images.githubusercontent.com/70824612/230707585-8543551c-f2d3-4c33-bf75-f66e6af8b81b.png)


Output:

![image](https://user-images.githubusercontent.com/70824612/230707431-92d11fa0-34dd-4926-842d-4d0d6f0335d6.png)


## Reference

- Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional.

- Head first design patterns : building extensible and maintainable object-oriented software
  Freeman, Eric, 1965- author.; Robson, Elisabeth, author. Sebastopol, California : O'Reilly 2021

- Decorator. Refactoring.Guru. (n.d.). Retrieved April 17, 2023, from https://refactoring.guru/design-patterns/decorator 

- Wikimedia Foundation. (2023, April 17). Decorator pattern. Wikipedia. Retrieved April 17, 2023, from https://en.wikipedia.org/wiki/Decorator_pattern 
