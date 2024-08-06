package TASK_1_Student_Record_Management_System;

public class Source extends FileHandling {
    
    private int noOfStudents;
    private int roll;
    private String name;
    private char grade;
    public int getNoOfStudents() {
        return noOfStudents;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    

}
