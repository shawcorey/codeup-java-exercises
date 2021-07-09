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

        //Add Third Element
        stringArr.add("Casey");
        System.out.println(stringArr);
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        //Remove Second Element
//        stringArr.remove(1);
//        System.out.println(System.identityHashCode(stringArr));
        ArrayList<String> stringArrCopy = stringArr;

        System.out.println("Array list copy: ");
        System.out.println(stringArrCopy);
        System.out.println("Copied List hashcode: ");
        System.out.println(System.identityHashCode(stringArrCopy));
        System.out.println("\n");

        stringArrCopy.remove(1);
        System.out.println(stringArr);

        System.out.println("The array list are equal: " + stringArr.equals(stringArrCopy));
    }
}
