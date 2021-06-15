package se.lexicon;

public class Car {

   //Global static Variable
   public static int sequencer = 0;

   //Global instance Variables
   public int id;
   public String model;
   public String brand;
   public String regNumber;

   public Car(String model, String brand, String regNumber){
      this.model = model;
      this.brand = brand;
      this.regNumber = regNumber;
      this.id = ++sequencer; //sequencer = sequencer + 1

   }


   public String getRegNumber() {
      return regNumber;
   }

   public static int getCurrentIdNumber() {
//      this //Not Allowed
      return sequencer;
   }

   public int getCurrentIdNumberNonStatic() {
      return sequencer;
   }



   //OBS! Only Demonstration purpose. Not Needed for the Car Class.

   public void nonstaticMethod(){
      System.out.println("Inside a non-static Method");
      staticMethod();
   }

   public static void staticMethod(){
      System.out.println("Inside Static method");

      // Not allowed to run instance methods in static. static method is created and executed before instance method is created.
      // nonstaticMethod();
   }





}
