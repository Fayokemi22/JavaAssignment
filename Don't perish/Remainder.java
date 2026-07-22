/*
collect a method that takes two integer
return their remainder
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Remainder{

public static int remain(int a, int b){

return a % b;

}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

System.out.print("Enter another");
int numberTwo = input.nextInt();

int remainResult = remain(number, numberTwo);

System.out.print( "The remainder of the two numbers is "  + remainResult );

}
}