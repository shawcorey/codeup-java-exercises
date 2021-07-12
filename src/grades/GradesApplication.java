package grades;

import warmpup.Input;

import java.util.HashMap;

import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> usernames = new HashMap<>();
        //Creates students
        Student nameOne = new Student("Micheal Jordan");
        Student nameTwo = new Student("Larry Bird");
        Student nameThree = new Student("Oscar Robertson");
        Student nameFour = new Student("Isiah Thomas");
        //Creates Students Grades
        nameOne.addGrade(90);
        nameTwo.addGrade(80);
        nameThree.addGrade(70);
        nameFour.addGrade(60);

        nameOne.addGrade(70);
        nameTwo.addGrade(60);
        nameThree.addGrade(90);
        nameFour.addGrade(80);

        nameOne.addGrade(80);
        nameTwo.addGrade(90);
        nameThree.addGrade(70);
        nameFour.addGrade(60);
        //Sets username with .put ---set a key value pair
        usernames.put("Coding Bull", nameOne);
        usernames.put("Coding Celtic", nameTwo);
        usernames.put("Coding Triple Double", nameThree);
        usernames.put("Coding Piston", nameFour);
        System.out.println("Welcome!");
        System.out.println("Here are the Github usernames of our Students:");
        // This code is printing out the usernames
        do {

        for (String key : usernames.keySet()) {
            System.out.print(" |" + key + "| ");
        }
        // Next Step is asking for user information "What student would you like to see more information on?
        System.out.println("\n\n What student would you like to see more information on? \n");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Student student = usernames.get(userInput);
        //make if statement if userInput = an existing username then ...

        // if the userInput doesn't match a username, then say "hey this username doesn't exist,
        // but if the username DOES exist, then give more info (grade and name) of that student
        // next step is to compare userkeys to userInput
        if (student == null) {

            System.out.println("\n Sorry no student found with that username of " + userInput + ".\n");
//            System.out.println(userInput);
        } else {
            System.out.printf("\nName: %s - GitHub Username: %s \n", student.getName(), userInput);
            System.out.printf("\nCurrent Average: %.1f\n", student.getGradeAverage()); // get object and then get method in the student class


        }
    }while (input.yesNo());
}
}
