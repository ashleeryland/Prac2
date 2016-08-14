import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
        int numEggs;
        double CARTON_PRICE = 3.25;
        double EGG_PRICE = 0.45;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter how many eggs you would like: ");
        numEggs = inputDevice.nextInt();

        int numDozen = numEggs / 12;
        int numLeftEggs = numEggs % 12;

        double priceDozen = numDozen * CARTON_PRICE;
        double priceEggs = numLeftEggs * EGG_PRICE;

        System.out.println("You ordered " + numEggs +" eggs. " + "That is " + numDozen + " dozen at $" + CARTON_PRICE
        + " per dozen and " + numLeftEggs + " loose eggs at $" + EGG_PRICE + " cents each." );
        System.out.println("That gives you a total of $" + (priceDozen + priceEggs));
    }

}
