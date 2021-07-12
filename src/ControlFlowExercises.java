import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println( + i);
////            i++;
//        }
        //Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);
//    }
//}


//Refactor the previous two exercises to use a for loop instead.
//
//        for(int i = 100; i >= -10; i -=5) {
////            System.out.print(i);
        // }
        //     for(long i = 2; i< 1000000; i*=i) {
        //System.out.println(i);
        //}
//     int i;
//        for(i = 1; i <= 100; i++) {
//            boolean fizzOrBuzz = false;
//
//
//            if(i % 3 == 0) {
//            System.out.print("fizz");
//            fizzOrBuzz = true;
//            }
//            if(i % 5 == 0) {
//            System.out.print(" buzz");
//            fizzOrBuzz = true;
//            }
//
//            if (fizzOrBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(i);
//            }
//            }

        Scanner input = new Scanner(System.in);
////
//        System.out.print("Enter an integer: ");
//        int yourNumber = input.nextInt();
//        System.out.println("Here is your table \n\"");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        int i;
//        for (i = 1; i <= yourNumber; i++) {
//            int squared = i * i;
//                int cubed = i * i * i;
//
//                System.out.println(i + "      | " + squared + "\t\t | " + cubed);
//        }
//
        String answer="";
             while(true){
             System.out.print("Enter a Grade: ");
             int yourGrade = input.nextInt();


             if (yourGrade > 95) {
             System.out.println("You received an A+");
             } else if (yourGrade > 90) {
             System.out.println("You received an A");
             } else if (yourGrade > 85) {
             System.out.println("You received a B+");
             } else if (yourGrade > 80) {
             System.out.println("You received a B");
             } else if (yourGrade > 75) {
             System.out.println("You received a C+");
             } else if (yourGrade > 70) {
             System.out.println("You received a C");
             } else if (yourGrade > 65) {
             System.out.println("You received a D+");
             } else if (yourGrade > 60) {
             System.out.println("You received a D");
             } else {
             System.out.println("You received an F");
             }
             System.out.println("do you want to continue?");
             answer=input.next();
                 if(answer.equals("yes")) {
                      continue;
                 } else if(answer.equals("no")) {
                      break;

                  }
             }

             }

             }
//        }

