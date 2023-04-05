# 5004-decorater-pattern-group3

Team Member: Judy Wang, Lu Yan, Jinda Zhang

## Introduction

The Decorator Pattern is a design pattern that allows behavior to be added to an object dynamically, without affecting the behavior or structure of other objects from the same class. In this pattern, we create a Decorator object that wraps around an existing object and adds additional behavior to it. The key benefit of the Decorator Pattern is that it allows you to add functionality to an object at runtime, without the need to modify the existing code. 

This follows the principle that code should be open for extension but closed for modification. Additionally, the Decorator Pattern follows the Single Responsibility Principle, as the decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job. 

The Decorator Pattern is used when you want to add behavior to an individual object, without affecting the behavior or structure of other objects from the same class. This pattern is widely used in GUI toolkits, where you can add various decorations to widgets, such as borders, shadows, and backgrounds.
![image](https://user-images.githubusercontent.com/70824612/229972235-1889ad5f-99b9-48d9-a6a5-a342527675ef.png)

## Application
The Decorator Pattern is used when you want to add or remove functionality to an object without affecting other instances of the same object. It is useful in situations where it is impractical to subclass every possible combination of attributes for an object.

A common example of the Decorator Pattern is in the creation of graphical user interfaces. Many graphical user interface frameworks use decorators to add functionality to basic widgets such as buttons and text boxes. By using decorators, the framework can dynamically add functionality to a widget at runtime.

Another common example of the Decorator Pattern is in the creation of coffee drinks. In this example, the base drink (e.g. espresso) is decorated with additional ingredients (e.g. milk, sugar, flavorings) to create a custom drink.


## Code description


## Reference
- Head first design patterns : building extensible and maintainable object-oriented software
Freeman, Eric, 1965- author.; Robson, Elisabeth, author. Sebastopol, California : O'Reilly 2021
- https://en.wikipedia.org/wiki/Decorator_pattern
