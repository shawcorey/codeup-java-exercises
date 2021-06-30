import java.util.Scanner;

public class HighLow {

    //---void is good for actions that dont require a result to give back.-----/

    public static void guessingGame() {
        //-----Prompt user to guess the number----//
        Scanner sc = new Scanner(System.in);
        String response = "";
        System.out.println("Guess The Number");

        //----game picks a random number between 1 AND 100------//

        int winningNumber = (int) (Math.random() * (100 - 1) + 1);
        int userInput = sc.nextInt();

        while (userInput != winningNumber){

            if (userInput < winningNumber) {
                response = "HIGHER";
            }
            else {
                response = "LOWER";
            }

                System.out.println("KEEP GUESSING");

            System.out.println(response);
            userInput = sc.nextInt();

        }
        System.out.println("GOOD GUESS!!!");
    }

    String userInput = "";
}
