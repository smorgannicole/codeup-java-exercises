package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Student1");
        student1.addGrade(85);
        student1.addGrade(92);
        student1.addGrade(78);
        students.put("daNumber1student", student1);

        Student student2 = new Student("Student2");
        student2.addGrade(90);
        student2.addGrade(88);
        student2.addGrade(94);
        students.put("daNumber2student", student2);

        Student student3 = new Student("Student3");
        student3.addGrade(75);
        student3.addGrade(81);
        student3.addGrade(79);
        students.put("daNumber3student", student3);

        Student student4 = new Student("Student4");
        student4.addGrade(92);
        student4.addGrade(87);
        student4.addGrade(95);
        students.put("daNumber4student", student4);

        /////////////////////////////
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("What student would you like to see more information on?");
            String usernameInput = scanner.nextLine();

            Student selectedStudent = students.get(usernameInput);
            if (selectedStudent != null) {
                System.out.println("Name: " + selectedStudent.getName() + " - GitHub Username: " + usernameInput);
                System.out.print("Grades: ");
                for (Double grade : selectedStudent.getGrades()) {
                    System.out.print(grade + " ");
                }
                double sum = 0;
                double average = 0;
                double count = 0;
                for (Double grade : selectedStudent.getGrades()) {
                    sum += grade;
                    count++;
                } average = sum / count;
                System.out.println("Current Average: " + average);
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + usernameInput + "\".");
            }

            System.out.println("\nWould you like to see another student? (yes/no)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nGoodbye, and have a wonderful day!");
        scanner.close();
    }
}
