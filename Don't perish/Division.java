/*
collect a method that takes two integer
return their decimal division
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Division{

public static double divide(int a, int b){

return a / b;

}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

System.out.print("Enter another");
int numberTwo = input.nextInt();

double divideResult = divide(number, numberTwo);

System.out.print( "The decimal division of the two numbers is "  + divideResult );

}
}