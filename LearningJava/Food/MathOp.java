package Food;
import java.util.Scanner;


public class MathOp {

	public static void main(String[] args) {
		
    weekday(3);
 
	}
	public void lottery(){
		
		 int lottery =  (int)( Math.random()*100); 
	     
	     Scanner input = new Scanner(System.in); 
		 System.out.println("Enter your lottery number: ");
		 int guess = input.nextInt();
		 
		 int firstDigit = guess/10;
		 int secondDigit = guess%10;
		 
		 System.out.println("The lottery number is: " + lottery);
		 
		 if (guess==lottery)
			 System.out.println("Congratulations! You have guessed the lottery number. You've won 10000$");
		 else if(firstDigit==lottery%10 && secondDigit==lottery/10)
			 System.out.println("Congratulaitons! You have guessed the digits of the lottery number. You've won 5000$");
		 else if (firstDigit == lottery/10 || secondDigit == lottery/10  || firstDigit == lottery%10 || secondDigit == lottery%10)
			 System.out.println("Congratulations! You have guessed one of the digits of the lottery number. You've won 1000$");
		 else
			 System.out.println("Sorry. You've guessed wrong."); 
		 input.close();	
	}
   public static void weekday(int day){
	   switch (day){
	   		case 1:
	   		case 2:
	   		case 3:
	   		case 4:
	   		case 5: System.out.println("It's a weekday!"); break;
	   		case 0:
	   		case 6: System.out.println("It's a weekend!"); break;
	   }
   }  
}
