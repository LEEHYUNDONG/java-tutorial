package javaTutorial.Interface;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.frontL = new KumhoTire();
        myCar.frontR = new KumhoTire();

        myCar.run();
    }
}
