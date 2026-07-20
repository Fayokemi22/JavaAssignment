/* prompt users to collect 3 scores 
find their average
returns the score with grade using if and  else statement
*/


import java.util.Scanner;

public class AgeYears{

public static void main(String[] args){

Scanner scoreCollector= new Scanner (System.in);

	System.out.print("First Score: ");

	double scoreOne = scoreCollector.nextDouble();

	System.out.print("Second Score: ");

	double scoreTwo = scoreCollector.nextDouble();

	System.out.print("Third Score: ");

	double scoreThree = scoreCollector.nextDouble();

double average= (scoreOne +  scoreTwo +  scoreThree) / 3;


if(average > 90){

System.out.println ("A");

}

else if (average > 80){

System.out.println ("B");

}

else if(average > 70){

System.out.println ("C");

}

else if(average > 60){

System.out.println ("D");

}

else{

System.out.println ("F");

}

System.out.println ("The Average is " + average);	


}
}