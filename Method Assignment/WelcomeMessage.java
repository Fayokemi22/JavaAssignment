public class WelcomeMessage{

	public static String greetings(String a){
	String greetings = a;
return greetings;
}

	public static int number(int n){
	int number = n * 2;
return number;
}
	public static boolean numberOne(int n){
	boolean numberOne = n < 0;
return numberOne;
}

	
	public static int average(int a, int b, int c){
	int average =  (a + b + c) / 3;
return average;
}

	public static boolean range(int n, int low, int high){
	if(n>=low && n<=high){ 
return true;
}
return false;
}




	public static void main(String[] args){
	String greetingsResult = greetings("Welcome to java");
	int numberResult = number( 2);
	boolean numberOneResult = numberOne(2);
	int averageResult = average(10, 5, 3);

	
		System.out.println(greetingsResult);
		System.out.println(" ");
		System.out.println("number multiply by 2 is " + numberResult);
		System.out.println(" ");
		System.out.println(numberResult);
		System.out.println(" ");
		System.out.println("The average of the three number is " + averageResult);
		
		System.out.println("It is " + numberResult);




}

}