/*
collect a method that takes in an integer
print many asterick on a single line
returns an integer
A main method that asks the user for a value
Prints the result
*/

import java.util.Scanner;
public class aster{

public static int number(int a){

int counter =0;

for(int count = 1; count<=6 ; count++){
counter += count;
}

return counter;
}


public static void main(String[] args){
Scanner input = new Scanner (System.in);

System.out.print("Enter number");
int asterick = input.nextInt();

int numberResult = number(asterick);
 for (int i = 1; i <= numberResult; i++) {
 System.out.print( "*" );

}
}
}