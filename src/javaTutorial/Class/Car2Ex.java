package javaTutorial.Class;

public class Car2Ex {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        System.out.println("car1.company :" + car1.company);
        System.out.println();

        Car2 car2 = new Car2("자가용");
        System.out.println("car2.company :" + car2.company);
        System.out.println("car2.model :" + car2.model);
    }
}
