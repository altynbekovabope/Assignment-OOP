public class Student extends Human {
    private String major;
    private float gpa;

    public static String universityName = "Astana IT University";

    public Student(int age, String name, boolean isMale, String major, float gpa) {
        super(age, name, isMale);
        this.major = major;
        this.gpa = gpa;
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
    @Override
    public void work(){
        System.out.println(getName() + " is studying " + major + " at " + universityName + " with a GPA:" + gpa + ".");
    }
}
