//        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".
//import java.util.Scanner;
//public class Strings {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        /* your code goes here */
//        System.out.println("enter your first name");
//        String myName = sc.next();
//        System.out.format("hello, replace this with %s", randomName);
//        System.out.printf("hi print a variable here: %s", randomName);
//    }
//}
//public class JavaClassNotes {
//
//
//}
////------------------ STRINGS 6-28-2021------------------------//
//// String: a non-primitive data type, refer to an objects
////         String msg = "hello";
////         System.out.println(msg);
////         msg = msg + ", how are you?";
////         System.out.println(msg);
////        TODO: create a String variable that holds this sentence: "Red
////         Orange Blue Yellow Green Purple". Prompt the user to type in
////         their favorite color, if their fave color is the same as the
////         first word in the String, then print out "my fave color:
////         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.
//
//public class basketBallTeam {
//    public static void basketBallTeam(String s) {
//
//        String teamSays = s + "is the best team";
//
//        System.out.println(teamSays);
//
//        counter(teamSays);
//
//    }
//}

//-----06/29/2021--------//
//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.
//public static String