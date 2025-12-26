package model;
import Interfaces.ILearnable;
import Interfaces.IWorkable;

public class Employee extends Human implements IWorkable, ILearnable {
    private String position;
    private float salary;

    public Employee(int age, String name, boolean isMale, String position, float salary) {
        super(age,name,isMale);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void introduce (){
        System.out.println("I am employee " + name + ".");
    }
    @Override
    public void work (){
        System.out.println(name + " works as " + position + ".");
    }
    @Override
    public void getSalary (){
        System.out.println("Salary: " + salary);
    }
    @Override
    public void study (){
        System.out.println(name + " is learning new skills.");
    }
    @Override
    public void showGPA(){
        System.out.println("Employee has no GPA.");
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public float getSalaryValue() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
