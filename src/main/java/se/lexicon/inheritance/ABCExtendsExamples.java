package se.lexicon.inheritance;

public class ABCExtendsExamples {
    public static void main(String[] args) {

        A objectA = new A();
        objectA.message(); // Message from A

        B objectB = new B();
        objectB.message(); // Message from B
        objectB.foo();

        C objectC = new C();
        objectC.message(); // Message from B, B is the closes implementation of message method.

        A objectCAsA = new C(); // Downgrade to A
        objectCAsA.message(); // Message from B, B is the closes implementation of message method.

        objectCAsA.message(); // Message from B
        //objectCAsA.foo();

    }
}

// Super|Parent Class To B & C
class A{
    public void message(){
        System.out.println("Message from A");
    }
}

// Super|Parent Class To C
// Sub|Child|Derived Class of A
class B extends A {

    @Override
    public void message() {
        System.out.println("Message from B");
    }

    public void foo(){

    }
}

// Sub|Child|Derived Class of B & A
//class C extends A,B{ } // Can't Extends more the one class.
class C extends B{ }
