import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        int dollarAmount;

        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter a dollar amount: ");
        dollarAmount = inputDevice.nextInt();

        int numTwenties = dollarAmount/20;
        int numTens = (dollarAmount - 20*numTwenties)/10;
        int numFives = (dollarAmount - (10*numTens + 20*numTwenties))/5;
        int numOnes = (dollarAmount - (10*numTens + 20*numTwenties + 5*numFives));

        System.out.println("20: " + numTwenties + "\n10: " + numTens
        + "\n5: " + numFives + "\n1: " + numOnes);
    }
}
