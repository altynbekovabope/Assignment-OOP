public class Human {

    private int age;
    private String name;
    private boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public void introduce(){
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
    public void work(){
        System.out.println(name + " is doing some work.");
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean getIsMale(){
        return isMale;
    }
    public void setIsMale(boolean isMale){
        this.isMale = isMale;
    }

}
