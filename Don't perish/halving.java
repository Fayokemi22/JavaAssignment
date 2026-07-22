/*
collect a method that takes in an integer
return half of the integer as a decimal
returns an integer
A main method that asks the user for a vale
Prints the result
*/

import java.util.Scanner;
public class Adding{

public static double digit(double a){

double digit = a / 2;

return digit;

}

public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter number");
double number = input.nextInt();

double digitResult = digit(number);

System.out.print( "The half of an integer is " + number + " is " +digitResult );

}
}