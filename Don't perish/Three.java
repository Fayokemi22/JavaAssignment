/*
collect a method that takes in an integer
return true if its divisible by 3 else it should print false
returns an integer
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Three{

public static boolean value(int a){

if(a % 3 == 0){ 
return true;
}
return false;
}


public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter number");
int number = input.nextInt();

boolean valueResult = value(number);

System.out.print( "The number is " + valueResult );

}
}