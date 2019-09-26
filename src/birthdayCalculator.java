import java.util.Scanner;
//NAME: Amar Harris
// PSID: 1310247

public class birthdayCalculator
{
    public static void main(String[] args)
    {

        String name;
        int cm, cd, cy, bm, bd, by;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\n****Birthday Calculator****\n");
        System.out.print("Enter your name: ");
        name = keyboard.next();

        System.out.println("\nCurrent day");
        System.out.print("Enter current month: ");
        cm = keyboard.nextInt();
        System.out.print("Enter current day: ");
        cd = keyboard.nextInt();
        System.out.print("Enter current year: ");
        cy = keyboard.nextInt();

        System.out.println("Birthday");
        System.out.print("Enter your birth year: ");
        by = keyboard.nextInt();
        System.out.print("Enter your birth month: ");
        bm = keyboard.nextInt();
        System.out.print("Enter your birth day: ");
        bd = keyboard.nextInt();

        int age = cy - by;
        System.out.println("\nYou are " + age + " years old.");

        if (cm==bm && cd==bd)
        {
            System.out.println("Happy Birthday " + name +"!" );
        }
    }
}
