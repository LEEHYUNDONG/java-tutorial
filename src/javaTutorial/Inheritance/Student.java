package javaTutorial.Inheritance;

public class Student extends People{
    public int studentN;

    public Student(String name, String ssn, int studentN){
        super(name, ssn);
        this.studentN = studentN;
    }
}
