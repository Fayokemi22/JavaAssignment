/*
collect a method that takes in an integer
add 10 to the number
returns an integer
A main method that asks the user for a vale
Prints the result
*/

import java.util.Scanner;
public class Adding{

public static int integer(int a){

int integer = a + 10;

return integer;

}

public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter number");
int number = input.nextInt();

int integerResult = integer(number);

System.out.print( "The sum of " + number + " is " +integerResult );

}
}