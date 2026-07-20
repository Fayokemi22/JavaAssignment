/* prompt users to enter 2 integer
1. Current  father's age (years)
2. current age of his son (years)
 father's years ago - (son age x 2)
 use if statement to determine if is greater or equal to zero
*/


import java.util.Scanner;

public class AgeYears{

public static void main(String[] args){

Scanner ageCollector= new Scanner (System.in);

	System.out.print("Current Father's Age: ");

		int fatherAge = ageCollector.nextInt();

	System.out.print("Current Age Of His Son: ");
		
		int sonAge = ageCollector.nextInt();

int years= fatherAge - (sonAge * 2);


 if (years>0){
System.out.println("The father would be twice older than his son in " + years + " years");
}


}
}