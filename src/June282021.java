import java.util.Scanner;

public class June282021 {

    public static void main(String[] args) {
        //System.out.println is Javas versions of console logging---//
        System.out.println("hello, World!");
        //-----Scanner is always needed to get User Input from the User----//
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        //---Saved to a variable ie: userInput------//
        String userInput = sc.next();
        System.out.println(customGreeting(userInput));
    }

//------New Method-------//
//------This creates a method that returns a string----/////
public static String customString() {

        String customString = "What's Up";

    System.out.println("What's Up");

    return customString;
}
//-----BRAND NEW METHOD-----//
//----Create a method that returns a string; that string will take the users name and return a custom message.----//
    public static String customGreeting(String username) {

        return username;

    }
}

