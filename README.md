# Object-Oriented Programming

> ### Paradigm  
> A style to program in.  
> A paradigm helps to reduce complexity of a program.  
> A way of doing thing.  
> [What Exactly is a Programming Paradigm](https://www.freecodecamp.org/news/what-exactly-is-a-programming-paradigm/)  

>  Extra Link for [Java Concept OOP](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)

## What?
Based on a concept of "Objects"
It's a Paradigm.


Model real world thing. (Dog, Car) with  
Objects = State, Behavior

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
Immutable - non-changeable  

se.lexicon.object_basics.Car

### Why?
Convenient  
Frequently used for storing a lot of characters.  

### How?
Syntax: ""  

String name = "";  
String name = new string();  

---

## Class Inheritance

### What?  
Core feature of OOP  
Structure to handle complexity in your program.  
hierarchy  

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