import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double gasGallons = 0;
        double fuelEfficiency = 0;
        double price = 0;
        boolean validInput = false;

        do {
            System.out.println("How many gallons of gas are in the tank?");
            if (in.hasNextDouble()){
                gasGallons = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a numerical value!");
                in.nextLine();
            }
        } while (!validInput);
        validInput = false;

        do {
            System.out.println("What is the fuel efficiency in miles per gallon?");
            if (in.hasNextDouble()){
                fuelEfficiency = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a numerical value!");
                in.nextLine();
            }
        } while (!validInput);
        validInput = false;

        do {
            System.out.println("What is the price of gas per gallon?");
            if (in.hasNextDouble()){
                price = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a numerical value!");
                in.nextLine();
            }
        } while (!validInput);

        double costPerHundredMiles = (100 / fuelEfficiency) * price;
        double maxDistance = gasGallons * fuelEfficiency;

        System.out.println("The cost to drive per 100 miles is: " + costPerHundredMiles);
        System.out.println("The max distance you can drive with a full tank is: " + maxDistance);
    }
}
