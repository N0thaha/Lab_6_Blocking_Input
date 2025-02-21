import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double width = 0;
        double length = 0;
        boolean validInput = false;

        do {
            System.out.println("What is the width of the rectangle? ");
            if (in.hasNextDouble()){
                width = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a numerical value!");
                in.next();
            }
        } while (!validInput);
        validInput = false;

        do {
            System.out.println("What is the length of the rectangle?");
            if (in.hasNextDouble()){
                length = in.nextDouble();
                validInput = true;
            } else{
                System.out.println("Invalid Input. Please enter a numerical value!");
            }
        } while (!validInput);

        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        double diagonal = (length * length) + (width * width);
        diagonal = Math.sqrt(diagonal);

        System.out.println("The area of the rectange is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);

    }
}
