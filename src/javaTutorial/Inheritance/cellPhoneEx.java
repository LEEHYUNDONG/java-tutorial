package javaTutorial.Inheritance;

public class cellPhoneEx {
    public static void main(String[] args) {
        DmbCellPhone d = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println(d.model);
        System.out.println(d.color);

        System.out.println(d.channel);

        d.PowerOn();
        d.bell();
    }
}
