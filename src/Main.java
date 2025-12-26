import Interfaces.ILearnable;
import Interfaces.IWorkable;
import model.Human;
import model.Employee;
import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee emp1 = new Employee(30, "Kaisar", true, "Developer", 3500);
        Student stu1 = new Student(20, "ALina", false, "Media Technologies", 3.8f,101);

        emp1.introduce();
        emp1.work();
        emp1.getSalary();
        emp1.study();
        emp1.showGPA();

        stu1.introduce();
        stu1.work();
        stu1.study();
        stu1.showStudentId();
        stu1.showGPA();

        Human h1 = new Employee(35, "Askar", true, "Manager", 5000);
        Human h2 = new Student(19, "Aruzhan", false, "IT", 3.9f, 102);

        h1.introduce();
        h1.work();
        h2.introduce();
        h2.work();

        IWorkable w1 = new Employee(28, "Kasym", true, "Tester", 2500);
        ILearnable l1 = new Student(20, "Dana", false, "Media", 3.7f, 103);

        w1.work();
        l1.study();
        l1.showGPA();

        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();

        Student stuInput = new Student(age,name,true,"IT", 4.0f, 104);
        stuInput.introduce();
        stuInput.showStudentId();
        stuInput.showGPA();
    }
}