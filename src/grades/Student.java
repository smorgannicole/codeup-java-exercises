package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    };
    public void addGrade(int grade) {
        grades.add(grade);
    };
    public double[] getGrades() {
        double[] gradesArray = new double[grades.size()];
        for (int i = 0; i < grades.size(); i++) {
            gradesArray[i] = grades.get(i);
        }
        return gradesArray;
    }
    public double getGradeAverage() {
        double sum = 0;
        double gradeAverage;
        for (double grade : grades) {
            sum += grade;
        } gradeAverage = sum / grades.size();
        return gradeAverage;
    };
}
