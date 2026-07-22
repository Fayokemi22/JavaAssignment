/*
collect a method that takes two integer
return true if they are equal, else false
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Equality{

public static boolean equals(int a, int b){

if(a==b){
return true;
}
return false;

}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number ");
int number = input.nextInt();

System.out.print("Enter another ");
int numberTwo = input.nextInt();

System.out.print( equals(number, numberTwo) );

}
}