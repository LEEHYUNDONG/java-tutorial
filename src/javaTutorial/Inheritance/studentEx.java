package javaTutorial.Inheritance;

public class studentEx {
    public static void main(String[] args) {
        Student s = new Student("이현동", "11111-11111", 1);
        System.out.println("name :" + s.name);
        System.out.println("ssn :" + s.ssn);
        System.out.println("studentNO :"+ s.studentN);
    }
}
