/*
collect a method that takes two integer
return the largest
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Smallest{

public static int small(int a, int b){

if (a < b){
return a;
}
else{
return b;
}
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number ");
int number = input.nextInt();

System.out.print("Enter another ");
int numberTwo = input.nextInt();

int smallResult = small(number, numberTwo);

System.out.print( " The smallest number  is "  + smallResult );

}
}