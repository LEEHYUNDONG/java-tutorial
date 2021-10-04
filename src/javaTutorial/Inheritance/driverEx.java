package javaTutorial.Inheritance;

public class driverEx {
    public static void main(String[] args) {
        Driver d = new Driver();

        Bus b = new Bus();
        Taxi taxi = new Taxi();

        d.drive(b);
        d.drive(taxi);
    }
}
