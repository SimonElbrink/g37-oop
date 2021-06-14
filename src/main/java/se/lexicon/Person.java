package se.lexicon;

//Class - BluePrint
//fields, Constructors, Custom Methods, getters & Setters, Equals & HashCodes, ToString
public class Person { // Start of Class

    //Fields - Members - State, nous, Global Variables
    private String firstName;//Default = null
    private String LastName;//Default = null
    private int birthYear; //Default = 0


    //All-Args Constructor = Covers all members in the argument List
    public Person (String firstName, String lastName, int birthYear){ //Start of Constructor
        //int number = 0; // Local Variable
        this(firstName, lastName);
        this.birthYear = birthYear;
    } //end of Constructor

    public Person (String firstName, String lastName){//Start of Constructor
        this();
        this.firstName = firstName;
        this.LastName = lastName;
    }//end of Constructor

    //No-Args Constructor = Not covering any members in the argument list
    public Person(){
        this.firstName = "UnknownFirstName";
        this.LastName = "UnknownLastName";
        this.birthYear = 1970;
    }


    //Declaring Method
    //Behaviors
    public int getAge(int currentYear){
        return currentYear - birthYear;
    }

    //Getters & Setters
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}//End of Class
