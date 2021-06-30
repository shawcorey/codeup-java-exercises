import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {
//        //public static int addition(int num1, int num2)
//        System.out.println(addition(2, 8));
//        System.out.println(subtraction(5, 2));
//        System.out.println(multiplication(6, 5));
//        System.out.println(division(4, 3));
//        System.out.println(modulus(3, 6));
//        System.out.println(getInteger(4,2));
//        System.out.println(Factorial(5));
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println();
//        int userInput = getInteger(0, 10);
//        System.out.println(userInput);
//
//        System.out.println("The factorial of " + "!" + userInput + " is: " + Factorial(userInput));
//        diceRoll(scan);
        HighLow.guessingGame();

    }
    ///------Basic Arithmetic----///
    //-------Exercise One-----////

    public static int addition(int num1, int num2) {
        return num1 + num2;

    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //--------Exercise 2-----------///
    //------Creat a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between " + min + "and" + max + ": ");//First prompt a user to enter an integer from 1 to 10
        int response = sc.nextInt();//Read the number
        if (response >= min && response <= max) {//If the number is in range, return it
            System.out.println("num in range ");
            return response;
        } else {
            return getInteger(min, max);//else; return getInteger(min, max)
        }
    }

    //-----Exercise 3---------///
//-----Calculate the factorial of a number----//
    public static int Factorial(int input) {
        int i, value = 1;
        for (i = 1; i <= input; i++) {
            value = value * i;
        }
        return value;
    }

    //---------Exercise 4--------///
    //------Create An Application that simulates dice rolling------////
    public static void diceRoll(Scanner scan) {

        while (true) {
            System.out.println("Give me the number of sides of the dice");
            short n = Short.parseShort(scan.nextLine());
            int range = n - 1 + 1;
            System.out.println("Your dice roll 1 = " + ((int) (Math.random() * range) + 1));
            System.out.println("Your dice roll 2 = " + ((int) (Math.random() * range) + 1));

            System.out.println("Do you wish to continue? y/n");
            if (scan.nextLine().toLowerCase().equals("n")) {
                break;
            }
        }
    }
}
