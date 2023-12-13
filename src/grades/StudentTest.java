package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Name1");
        student1.addGrade(80);
        student1.addGrade(100);
        System.out.println(student1.getGradeAverage());
    }
}
