package model;

import Interfaces.ILearnable;

public final class Student extends Human implements ILearnable {
    private String major;
    private float gpa;

    public static final String UNIVERSITY_NAME = "Astana IT University";
    private final int studentId;

    public Student(int age, String name, boolean isMale, String major, float gpa, int studentId) {
        super(age, name, isMale);
        this.major = major;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    @Override
    public void introduce(){
        System.out.println("I am a student. My name is " + name + ".");
    }
    @Override
    public void work(){
        System.out.println(name + " is studying " + major + ".");
    }
    @Override
    public void study(){
        System.out.println(name + " studies at " + UNIVERSITY_NAME + ".");
    }

    public final void showStudentId(){
        System.out.println("Student ID: " + studentId);
    }
    @Override
    public void showGPA(){
        System.out.println("Student GPA: " + gpa);
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(String major) {
        this.major  = major;
    }
    public float getGpa(){
        return gpa;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
}