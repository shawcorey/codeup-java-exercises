package warmpup;

import java.util.ArrayList;

public class Collections {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();
        //Add First element
        stringArr.add("Corey");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        //Add Second Element
        stringArr.add("Raul");
        System.out.println(stringArr);
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        //Remove Second Element
        stringArr.remove(1);
        System.out.println();
    }
}
