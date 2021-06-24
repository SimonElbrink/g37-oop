# Object-Oriented Programming
>  Link for [OOP in Java](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)

> ### Paradigm  
> A style to program in.  
> A paradigm helps to reduce complexity of a program.  
> A way of doing things, Patterns, ideal
> [What Exactly is a Programming Paradigm](https://www.freecodecamp.org/news/what-exactly-is-a-programming-paradigm/)  


## What?
Based on a concept of "Objects"

A Paradigm = Patterns, ideal conditions.

Objectifying this world in to code. It's a good beginning.  
Model real world thing. (Dog, Car) with  
Objects = State & Behavior
> State - attributes, nouns   
> Behavior - Methods, verbs


### Why?
Code Structure  
Modularity  
Directly associate real-world problems.  

### How?  
Objects, Classes, Inheritance, Interfaces, Packages  
or  
Class, Abstraction, Encapsulation, Inheritance and Polymorphism.  

---

## String

### What?
Object  
java.lang.String  
char[]  
Immutable - unmodifiable or unchangeable, but can be changes to a new String Object


se.lexicon.object_basics.Car

### Why?
Convenient  
Frequently used for storing a lot of characters, text

### How?
Syntax: ""  

String name = "";  
String name = new string();  

---

## Class Inheritance

### What?  
Core feature of OOP  
Structure to handle complexity in your program.  
Hierarchy | Family Tree 

animal -> mammal -> Dog  
animal -> mammal -> Cat  
animal -> Bird -> Eagle


### Why?  
Clear intentions - Readability  
Reusable code


### How?  
Syntax/Keyword:
``extends``  

ex.

```Java
class A{}
```
```Java
class B extends A {}
```

---


## Interfaces

### What?
Interfaces are not a Class, It's a set of requirements|Contract that a class can implement.  
Working as a contract between Classes and outside world requirements.

### Why?
Structure  
Clearance about Between outside requirements.

### How?

Syntax:  
``interface``  
``implements``


ex1.
````java
interface calculateSalary{}
````
````java
class employee implements calculateSalary{}
````


ex2.

How to Make a class implement an interface.
1. You declare that your class intend to implement the given interface.
1. You supply implementation for all methods in the interface.

````java
// For some background of the Class
public interface Comparable {
    public int compareTo(Object o);
}
````


```Java
                      //1
public class Employee implements Comparable{

    private int salary;

    //2
    @Override
    public int compareTo(Object otherObject) {

        Employee other = (Employee) otherObject;
        return Double.compare(salary, other.salary);
    }

}
```

---

## Enum

### What?  
Not a class or interface = enum  
Special Datatype.  
Predefined Constants - at Compile Time


#### Like:  
> Gender  
> Season  
> Month  
> Days in a week  
> Measurement
> Deck of cards  
> Dice  
> Planets in our solar system  

### Why?  
Easy access to specific Values
Strict set of rules of what is allowed.

### How?  

ex1.
```java
//How you start creating a Enum
enum Month{}

//How You create a Class
class Person{}

//..and Interface
interface Swim{}
```

````java
class App {
    public static void main(String[] args) {
        Person newPerson = new Person();
        Month[] allMonths = Month.values();
    }
}
````

ex2.
````java
enum Day{
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
````













