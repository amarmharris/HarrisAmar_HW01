import java.util.Scanner;
//NAME: Amar Harris
//PSID: 1310248

public class restaurantCalculator
{
    public static void main (String[] args)
    {

        //Declaration of all variables
        int numOfItems;
        Scanner keyboard = new Scanner(System.in);
        float subTotal = 0;
        float tax;
        float tip;
        float total;

        //Program title
        System.out.println("\n****Restaurant Bill Calculator****\n");

        //Gather # of items and prices
        System.out.print("Enter the number of items you ordered: ");
        numOfItems = keyboard.nextInt();
        float [] prices = new float[numOfItems];
        System.out.println("Enter prices for each item:");
        for (int i = 0; i < numOfItems; i++)
        {
            System.out.print("Item " + (i +1) + ": ");
            prices[i] = keyboard.nextFloat();
        }

        //calculate subtotal
        for(int i = 0; i < numOfItems; i++)
        {
            subTotal += prices[i];
        }

        //calculate tax
        tax = (float) (subTotal * .0825);

        //calculate tip
        if (subTotal > 100.00) {
            tip = (float) (subTotal * .20);
        } else if (50.00 < subTotal  && subTotal <= 100.00) {
            tip = (float) (subTotal * .15);
        } else if (25.00 < subTotal && subTotal < 50.00) {
            tip = (float) (subTotal * .05);
        } else {
            tip = 0;
        }

        //calculate total
        total = subTotal + tax + tip;

        //Print bill
        System.out.println("\nBILL");
        System.out.println("ItemTotal= "+subTotal);
        System.out.println("Calculated Tax (8.25%) = " + tax);
        System.out.println("Tip = " + tip);
        System.out.println("FinalTotal: " + total);
    }
}
