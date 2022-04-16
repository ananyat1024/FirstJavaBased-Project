package unit01;

/*
  Variables are data containers that store values in them
  In Java, there are 3 types of Variables:
  
  1.)Local Variable-declared inside a method
  2.)Instance Variables: declared without static keyword
                         defined outside a method declaration and are excessed thru objects.
  3.)Static Variables: declared with static keyword
                       are initialized first and only once & can be accessed firectly thru class
                         
 */
public class P3_Task01_VariablesAndDataTypeInJava {
	 static int a = 11; // static variable declaration

	    public static void main(String[] args) {
	        int b = 10; // local varible declaration
	        System.out.println("The value of a: " + a);
	        System.out.println("The value of b: " + b);
	        newclass obj = new newclass(); // creating object of class
	        System.out.println("The value of c: " + obj.c);
	        TypeconversionAndTypecasting();

	    }

	    static void TypeconversionAndTypecasting() {
	        int x = 23;
	        double d;
	        d = x; // typeconversion from int double
	        System.out.println("The value of d: " + d);
	        double u = 1023.987;
	        int y = (int) u; // typecasting from double to int, lost in values
	        System.out.println("The value of y: " + y);

	    }

	}

	class newclass { // defining a new class
	    int c = 100; // instance variable declaration
	}