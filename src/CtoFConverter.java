import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;

        while (!validInput){
            System.out.println("Enter temperature in Celsius");
            if (in.hasNextDouble()){
                celsius = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a celsius value! ");
                in.next();
            }
        }

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("The equivalent temperature in fahrenheit is " + fahrenheit);
        if (celsius == 0){
            System.out.println("This is the freezing point!");
        } else if (celsius == 100){
            System.out.println("This is the boiling point!");
        }
    }
}