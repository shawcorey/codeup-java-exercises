package warmpup;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public boolean yesNo(){
        System.out.println("enter [y/n]");
        String input = this.getString();
        return (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
    }
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        return this.scanner.nextLine();
    }
}
