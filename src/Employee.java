public class Employee extends Human {
    private String position;
    private float salary;

    public Employee(int age, String name, boolean isMale, String position, float salary) {
        super(age,name,isMale);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void work(){
        System.out.println(getName() + " is working as a " + position + " and earns $" + salary + ".");
    }
}
