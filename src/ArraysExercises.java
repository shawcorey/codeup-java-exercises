import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        toString(numbers);
        // For loop to print out all items in the array
//        for(int n : numbers){//            System.out.println(n);//        }
        Person person = new Person("Cody");
        Person person2 = new Person("Ryu");
        Person person3 = new Person("Akuma");
        String[] personArray = {person.getName(), person2.getName(), person3.getName()};
        System.out.println(Arrays.toString(personArray));
        String[] newArray = addPerson(personArray, "Canti");
        System.out.println(Arrays.toString(newArray));
    }

    private static void toString(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    static String[] addPerson(String[] person, String newPerson) {
        person = Arrays.copyOf(person, person.length + 1);
        person[person.length - 1] = newPerson;
//        System.out.println(Arrays.toString(person));
        return person;
    }
}
