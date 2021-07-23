import java.util.Scanner;

//this is the class (file) name
public class ConsoleExercises {
    //this the MAIN method. ALl of your main code lives inside of your main method.
    public static void main(String[] args) {
        //Declaring a new variable with a data type (double) and setting it to 3.14159
        //The Syntax will be the type of data first (double) followed by the name of the variable; Then you assign it with one = sign;
        //followed by the actual value being stored in that variable.
        double pi = 3.14159;
//        double pi = "The value of pi is approximately 3.14";


        System.out.format("The value of pi is: %f", pi);

        System.out.println("Please enter a number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");

        int userInput = sc.nextInt();

        System.out.println("You entered:" + userInput);

        System.out.println("Enter 3 words:");
        String sentence = sc.nextLine();

        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();

        System.out.println(word1 + " " + word2 + " " + word3);

        System.out.println(sentence);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for length: ");
//
        int length = scanner.nextInt();

        System.out.println("Enter a number for width:");

        int width = scanner.nextInt();

        int area = length * width;

        int perimeter = 2 * (length + width);

        System.out.printf("Area of the room is: %d feet\n", area);

        System.out.printf("Perimeter of the room is: %d feet\n", perimeter);
        scanner.close();

    }



}
