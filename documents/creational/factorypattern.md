# Factory Method Pattern or Factory Pattern

## Definition

A factory pattern or factory method pattern says that just

* ***define an interface or abstract class for creating an object but let the subclass decide which class to instantiate. In other words subclasses are responsible to create the instance of the class.***
* Factory method pattern is also called as Virtual Constructor


##Advantages

* Factory method pattern allows the sub-classes to choose the type of objects to create.
* It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code. That means the code interacts solely with the resultant interface or abstract class, so that it will work with any classes that implement that interface or that extends that abstract class.

##Usage of Factory Design Pattern

* Factory design pattern provides approach to code for interface rather than implementation.
* Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
* Factory pattern provides abstraction between implementation and client classes through inheritance.


##Example

check example code [here](https://github.com/foodminer/design-patterns/tree/master/src/com/morsu/designpatterns/creational/factorymethod)