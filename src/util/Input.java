package util;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);

    }
    public String getString(){
        return this.scanner.nextLine();
    }
//    public boolean yesNo(){
//        System.out.print("Yes or Yes?: ");
//        String answer = scanner.next().toLowerCase();
//        if(answer.equals("y") || answer.equals("yes")){
//            return true;
//        }
//        return false;
//    }
//    public int getInt(int min, int max){
//
//        int num;
//        do {
//            System.out.println("Enter a number:");
//            num = this.scanner.nextInt();
//
//        }while (num < min || num > max);
//        return num;
//
//    }
    public int getInt(){
        System.out.print("Please enter a number: ");
        try {
            return Integer.valueOf(getString());

        }catch (NumberFormatException e){
            System.out.println("Not a correct Integer!");
            return getInt();
        }

    }
//    public double getDouble(double min, double max){
//        this.doubleNum = getDouble();
//        if(doubleNum < min){
//            System.out.println("Please pick a number between " + min + " and " + max);
//            getDouble(min, max);
//        } else if(doubleNum > max){
//            System.out.println("Please pick a number between " + min + " and " + max);
//            getDouble(min, max);
//        }
//        return this.doubleNum;
//    }
    public double getDouble(){
        System.out.print("Please enter a number: ");

        try {
            return Double.valueOf(getString());

        }catch (NumberFormatException e){
            System.out.println("Not a correct number!");
            return getInt();
        }


    }

    public int showOptions() {
        return 0;
    }
}