import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your first name?");
//        String firstName = sc.next();
//        System.out.printf("You entered: %s\n", firstName);
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your last name is: %s\n",firstName);
//        System.out.printf("Your last name is: %s\n", lastName);
        //-------------------------------------------------------//
        //Scanner class allows us to get data input that the user enters into the console
//        Scanner sc = new Scanner(System.in);
         /* TODO: use the scanner to take in the name of the month you were born and print it back out
    - remember to first prompt the user for the input
 */
//        System.out.println("What is your birth month?");
//        String birthMonth = sc.next();
//        System.out.printf("You entered: %s\n", birthMonth);
//        System.out.printf("Your birth month is: %s\n",birthMonth);
        //----------------------------------------------------------//
        //next.int looks for the next set of integers
//        System.out.print("Enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);
        //----------------------------//
        //sc.nextLine();
        //boolean hasNL = sc.hasNext();

        //System.out.print does not add to the line
        //printf will allow us to format a string
//        System.out.printf("Maybe new line");
//        System.out.print("My name is Corey");
//        System.out.println("Pay attention in class");
//        int age = 37;
//        String name = "Corey";
//        String role = "instructor";
//        System.out.printf("My name is %s", name);
//        //other ways to format a string
//        String mySentence = String.format("My name is %s", name, role, age);
//        System.out.println(mySentence);
////        int currencyInPennies = 1000;
//        float currencyInPennies = 1000.0f;
//        System.out.printf("Ill sell you swamp land for $%.2f", currencyInPennies / 100.00);
//         while (sc.hasNext()){
//             String word = sc.next();
//             //Comparing Strings use .equals
//             if (word.equals("break")){
//                 break;
//             }
//
//             System.out.println(word);
//         }
//
//    }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter a number: ");
//
//        int num = sc.nextInt();
//
//        System.out.printf("Your number was: %d\n", num);
//
//        System.out.println("Please type a sentence:");
//
//        String sentence = sc.nextLine();
//
//        System.out.println(sentence);

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Please enter the length and width: ");
        int num = Integer.parseInt(sc.nextLine());
        String sentence = sc.nextLine();

        System.out.println(num);
        System.out.println(sentence);

    }
}




