import javax.lang.model.element.NestingKind;

public class ConsoleIO {

    public static void main(String[] args) {
        //Sysytem.out.print does not add to the line
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
//        int currencyInPennies = 1000;
        float currencyInPennies = 1000.0f;
        System.out.printf("Ill sell you swamp land for $%.2f", currencyInPennies / 100.00);


    }



}
