import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
                in.next();
            }
            guess = in.nextInt();

            if (guess < 1 || guess > 10) {
                System.out.println("Out of range! Please enter a number between 1 and 10.");
            }
        } while (guess < 1 || guess > 10);

        System.out.println("The random number was: " + randomNumber);
        if (guess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("On the money! You guessed it!");
        }
    }
}
