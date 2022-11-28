import java.util.Random;
import java.util.Scanner;
import java.io.*;
  
public class NumberGuessingGame {
    public static void main(String[] args)
    {
        int ans, guess;
	    char ch;
  
        final int MAX = 100;

        Scanner sc = new Scanner(System.in);
  
        Random random = new Random();
  
        boolean correct = false;

        ans = random.nextInt(MAX) + 1;
  
	    System.out.println("**Number Guessing Game!!**\n\n");
	    System.out.println("To Start The game press 'Y'");
		
	    ch=sc.next().charAt(0);
	
	    if(ch=='Y' || ch == 'y')
	{
      	  while (!correct) {

            System.out.println("Guess a number between 1 and 100: ");

            guess = sc.nextInt();

            if (guess > ans) {
                System.out.println("Number Entered is Large!!");
            }
  
            else if (guess < ans) {
                System.out.println("Number Entered is Small!!");
            }

            else {
  
                System.out.println("Yes, you guessed the number.");
  
                correct = true;
            }
	}
        }
        System.exit(0);
    }
}
