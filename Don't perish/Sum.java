/*
collect a method that takes two integer
return their sum
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Sum{

public static int addition(int a, int b){

return a + b;

}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

System.out.print("Enter another");
int numberTwo = input.nextInt();

int additionResult = addition(number, numberTwo);

System.out.print( "The sum of the two numbers is "  + additionResult );

}
}