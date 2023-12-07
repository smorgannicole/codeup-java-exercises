import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //WHILE

//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("Current value of i = %d\n", i);
//            i++;
//        }

        //DO-WHILE

//        long i = 2;
//        do {
//            System.out.printf("i = %d\n", i);
//            i += 2;
//        } while (i <= 100);

//        long i = 100;
//        do {
//            System.out.printf("i = %d\n", i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.printf("i = %d\n", i);
//            i *= i;
//        } while (i <= 100000);

        //FOR

//        for (int i = 2; i <= 100; i +=2) {
//            System.out.printf("i = %d\n", i);
//        }

//        for (long i = 100; i >= -10; i -= 5)
//            System.out.printf("i = %d\n", i);


//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.printf("i = %d\n", i);
//        }


        /* Write a program that prints the numbers from 1 to 100.
           For multiples of three: print “Fizz” instead of the number.
           For the multiples of five: print “Buzz”.
           For numbers which are multiples of both three and five: print “FizzBuzz”.*/

//        for (long i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0) {
//                System.out.printf("fizz %s \n", i);
//            }
//            if (i % 5 == 0) {
//                System.out.printf("buzz %s \n", i);
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.printf("fizzbuzz %s \n", i);
//            }
//                System.out.printf("%s \n", i);
//        }

        /*Display a table of powers.
        Prompt the user to enter an integer.
        Display a table of squares and cubes from 1 to the value entered.
        Ask if the user wants to continue.
        Assume that the user will enter valid data.
        Only continue if the user agrees to.*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to?");
//        String userNum = sc.next();
//        int lengthParse = parseInt(userNum);
//        System.out.println("Here is your table!");
//        for (int i = 1; i<= lengthParse; i++){
//            long numSquared = (long) i * i;
//            long numCubed = numSquared * i;
//            System.out.printf("number | squared | cubed\n" +
//                    "------ | ------- | -----\n" +
//                    "%s      | %s       | %s\n", i, numSquared, numCubed);
//        }

        /*Convert given number grades into letter grades.
        Prompt the user for a numerical grade from 0 to 100.
        Display the corresponding letter grade.
        Prompt the user to continue.
        Assume that the user will enter valid integers for the grades.
        The application should only continue if the user agrees to.*/
//        System.out.println("Enter a grade from 0 to 100");
//        Scanner sc = new Scanner(System.in);
//        String numGrade = sc.next();
//        int numGradeParsed = Integer.parseInt(numGrade);
//        System.out.printf("You entered a grade of %s\n", numGrade);
//        System.out.println("Would you like to continue? Enter Y for yes or N for no");
//        String userContinue = sc.next();
//        if (userContinue.equals("Y") || userContinue.equals("y")) {
//            if (numGradeParsed >= 88) {
//                System.out.println("You got an A");
//            }
//            if (numGradeParsed >= 80 && numGradeParsed <= 87) {
//                System.out.println("You got a B");
//            }
//            if (numGradeParsed >= 67 && numGradeParsed <= 79) {
//                System.out.println("You got a C");
//            }
//            if (numGradeParsed >= 60 && numGradeParsed <= 66) {
//                System.out.println("You got a D");
//            }
//            if (numGradeParsed >= 0 && numGradeParsed <= 59) {
//                System.out.println("You failed");
//            }
//        }

    }
}

