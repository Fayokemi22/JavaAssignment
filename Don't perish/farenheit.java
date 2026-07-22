/*
collect a method that takes in a temperature
return the equivalent in farenheit 
returns an farenheit
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class farenheit{

public static double farenheits(int c){

double farenheits = (c * 9 / 5) + 32;
return farenheits;
}


public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter number");
int number = input.nextInt();

double farenheitsResult = farenheits(number);

System.out.print( "The number is " + farenheitsResult );

}
}