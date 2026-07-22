/*
collect a method that takes in a string
return true if the forward is the same as backward
returns 
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class palindrome{

public static String name(String a ){

if (a.charAt(0) == a.charAt(2));
return a;
}


public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter a name");
String myName = input.nextLine();

String nameResult= name(myName);

System.out.println( myName + " ," +  nameResult + "is a palindrome" );

}
}
