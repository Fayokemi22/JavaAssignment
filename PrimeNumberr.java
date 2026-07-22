import java.util.Scanner;

    public class PrimeNumberr {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int wholeNumber = input.nextInt();

        int sumResult = dividenumber(wholeNumber);

        System.out.println("Sum of prime number: " + sumResult);


}

    public static int dividenumber(int number){
     int sum = 0;
    
    for(int dividenumber = 2; dividenumber <= number; dividenumber ++){

    while(number % dividenumber == 0){

        sum += dividenumber;
        number = number / dividenumber;
   }
    }
        return sum;
        }


        }
