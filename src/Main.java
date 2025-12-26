import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Human human =  new Human(25, "Alibek", true);
        Employee employee = new Employee(30, "Kaisar", true, "Developer", 3500);
        Student student = new Student(20, "ALina", false, "Media Technologies", 3.8f);

        System.out.println("Enter name: ");
        human.setName(scanner.nextLine());

        System.out.println("Enter age: ");
        human.setAge(scanner.nextInt());

        System.out.println("Are they male? true/false: ");
        human.setIsMale(scanner.nextBoolean());

        System.out.println("Human info:");
        System.out.println("Name: " + human.getName());
        System.out.println("Age: " + human.getAge());
        System.out.println("Is male: " + human.getIsMale());

        human.introduce();
        human.work();
        employee.work();
        student.work();
    }
}