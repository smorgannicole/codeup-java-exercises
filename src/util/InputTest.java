package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String userString = input.getString();
        System.out.println("User entered a string: " + userString);

        boolean userYesNo = input.yesNo();
        System.out.println("User boolean is of value: " + userYesNo);

        int userIntInRange = input.getInt(1, 10);
        System.out.println("User entered an integer between 1 and 10: " + userIntInRange);

        int userInt = input.getInt();
        System.out.println("User entered an integer of value: " + userInt);

        double userDoubleInRange = input.getDouble(1.0, 10.0);
        System.out.println("User entered a double between 1.0 and 10.0: " + userDoubleInRange);

        double userDouble = input.getDouble();
        System.out.println("User entered an integer of value: " + userDouble);
    }
}
