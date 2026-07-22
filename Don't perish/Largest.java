/*
collect a method that takes two integer
return the largest
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class Largest{

public static int large(int a, int b){

if (a > b){
return a;
}
else{
return b;
}
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

System.out.print("Enter another");
int numberTwo = input.nextInt();

int largeResult = large(number, numberTwo);

System.out.print( " The largest number  is "  + largeResult );

}
}