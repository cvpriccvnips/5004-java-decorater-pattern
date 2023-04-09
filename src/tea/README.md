Decorator Pattern

The Decorator Pattern is a structural design pattern that allows objects
to be dynamically extended with new functionality at runtime 
without affecting the behavior of existing objects.  It is is sometimes referred to 
as the "Wrapper" pattern, as it involves wrapping an object with one or more decorators 
that provide additional functionality. To implement the pattern, a decorator 
must implement the same interface as the wrapped object, which allows the 
client to treat them as identical objects. This approach enables the 
addition of new features and behaviors to an object without modifying 
its existing code, resulting in a flexible, modular, and easily maintainable codebase.


Overview

This project provides an example implementation of the Decorator Pattern in Java, 
using a simple example of a tea ordering system. The base class, Tea, defines the 
core functionality of a beverage, including its name and price. 
The ToppingDecorator abstract class defines the interface for decorators, 
which can be used to add additional functionality to a tea order, such as toppings or sizes.

The project includes several concrete decorator classes, such as tapioca,redbean, 
coconut,etc topping options, which add specific flavorings and size options to a tea. 
These decorator classes extend the Decorator class and implement the getDescription 
and getCost methods to add their own functionality to the beverage.


When to consider using decoration pattern
...............................


Getting Started

To get started with this project, you will need to have Java installed on your system. 
You can clone this repository and open the project in your favorite Java IDE.

Once you have the project open, you can run the Main driver to see an example of how 
the Decorator Pattern can be used to order a tea with different sizes and toppings.


How to use our tea ordering system
.............................



Resources: 
- Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). Design Patterns: Elements of Reusable Object-Oriented Software. Addison-Wesley Professional.
