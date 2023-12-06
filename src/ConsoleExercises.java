import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter an int");
//        int userNum = sc.nextInt();
//        System.out.printf("You entered: --> %s <--", userNum);

//        System.out.println("Enter three separate words");
//        String userInput1 = sc.next();
//        String userInput2 = sc.next();
//        String userInput3 = sc.next();
//        System.out.printf("Your words are %s, %s, and %s", userInput1, userInput2, userInput3);

//        System.out.println("Enter a sentence");
//        String sentenceInput = sc.nextLine();
//        System.out.printf("Your sentence is: %s", sentenceInput);

        System.out.println("Enter the length of your classroom");
        String length = sc.next();
        int lengthParse = parseInt(length);
        System.out.println("Enter the width of your classroom");
        String width = sc.next();
        int widthParse = parseInt(width);
        System.out.printf("Your classroom length is %s and width is %s\n", lengthParse, widthParse);
        int perimeter = (lengthParse * 2) + (widthParse * 2);
        System.out.printf("Your classroom perimeter is %s\n", perimeter);
        int area = (lengthParse * widthParse);
        System.out.printf("Your classroom floor area is %s", area);





    }
}
