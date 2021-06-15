package se.lexicon;

public class StringManipulation {


    public static void main(String[] args) {

        // Objects ALWAYS starts with uppercase
        String object = "Hello this is a message";

        // instantiating a string
        String string1 = new String();


        "StringText".toString();



        // Primitives don't have methods.
        int integerValue = 123;
        //integerValue.?

        // Objects Do.
        object.toString();



        //---------------------- String Methods ---------------------


        System.out.println("object.length() = " + object.length());

        for (int i = 0; i < object.length(); i++) {

            System.out.println(object.charAt(i));
        }

        System.out.println("object.charAt(6) = " + object.charAt(6)); // t


        System.out.println("object.indexOf(\"s\") = " + object.indexOf("s"));

        System.out.println("object.indexOf(\"s\",10) = " + object.indexOf("s", 10));


        System.out.println("object.substring(6) = " + object.substring(6)); //this is a message

        System.out.println("object.substring(6,14) = " + object.substring(6,14));//this is


        String unstructuredMessage = "H3Llo-mY NaM3_is S1Mon";

        System.out.println("Original Message: " + unstructuredMessage);

        System.out.println("unstructuredMessage.toLowerCase() = " + unstructuredMessage.toLowerCase());
        System.out.println("unstructuredMessage.toUpperCase() = " + unstructuredMessage.toUpperCase());

        System.out.println("Original Message: " + unstructuredMessage);



        //---------------------- Equals ---------------------

        String stringValue = "Hello World";
        String stringValue1 = "heLLo WoRlD";

        boolean isNotEqual = stringValue.equals(stringValue1); //False

        boolean isEqual = stringValue.equalsIgnoreCase(stringValue1); //True

        System.out.println("isNotEqual = " + isNotEqual);
        System.out.println("isEqual = " + isEqual);


        if (stringValue == stringValue1){
            System.out.println("Don't use this to compare");
        }


        if (stringValue.equals(stringValue1)){
            System.out.println("Use This");
        }

        //---------------------- startsWith, endsWith & contains ---------------------


        String evaluate = "Hello This is a Message!";

        evaluate.startsWith("hello"); //false

        System.out.println("evaluate.endsWith(\"!\") = " + evaluate.endsWith("!")); // true

        evaluate.contains(" is"); // true
        evaluate.contains(" Is"); // false




        //---------------------- Replace ---------------------

        String magic = "abracadabra";

        System.out.println("Original magic String = " + magic);

        //Replaces all 'a' to 'A'
        System.out.println("magic.replace('a','A') = " + magic.replace('a','A'));
        System.out.println("magic.replaceAll(\"a\", \"A\") = " + magic.replaceAll("a", "A"));

        System.out.println("magic.replaceFirst(\"a\", \"A\") = " + magic.replaceFirst("a", "A"));

        System.out.println("magic.replace(\"abra\", \"dabra\") = " + magic.replace("abra", "dabra"));



        //---------------------- Trim ---------------------

        System.out.println("        \n     \t  Hello \t World!     \t       \n");
        System.out.println("        \n     \t  Hello \t World!     \t       \n".trim()); // Only removes spaces in the beginning and the end of string.



        //---------------------- Join ---------------------

        String[] sizes = {"XS", "S", "M", "L", "XL", "XXL", "3XL", "4XL", "5XL", "6XL"};
        String joining = String.join(" / ", sizes );

        System.out.println("joining = " + joining);



        












    }



}
