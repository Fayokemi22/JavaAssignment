/*
collect a method that takes in an integer
computes its cube (n × n × n)
returns an integer
A main method that asks the user for a number
aalls your cube method
Prints the result
*/

import java.util.Scanner;
public class Cubing{

public static int integer(int a)

int integer = a * a * a;

return integer;

}

public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter integer");
int integer = next.input();

int cubeResult = cube(integer);

System.out.print( "The cube of " + integer + "is" + cubeResult );

}
}