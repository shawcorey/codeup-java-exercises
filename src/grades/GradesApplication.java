package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
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

        for(String key: usernames.keySet()){
            System.out.print(" |" + key + "| ");
        }

    }
}
