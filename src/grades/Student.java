package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade;

    public Student(String name) {
        this.name = name;
        this.grade = new ArrayList<>();

    }
    // returns the student's name
    public String getName(){
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grade.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for (int i = 0;  i < this.grade.size(); i++ ){
            sum = sum + this.grade.get(i);
        }
        return(double) sum / this.grade.size();

    };
    public Student() {
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println();
    } // returns the student's name public String getName(){ return this.name; } // adds the given grade to the grades property public void addGrade(int grade){ this.grade.add(grade); } // returns the average of the students grades public double getGradeAverage(){ double sum = 0; for (int i = 0; i < grade.size(); i++) { sum = sum + grade.get(i); } return sum / grade.size(); } }
}

