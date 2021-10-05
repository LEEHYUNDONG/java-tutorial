package javaTutorial.Interface;

public class CarEx {
    public static void main(String[] args) {
//        Car myCar = new Car();
//
//        myCar.run();
//
//        myCar.frontL = new KumhoTire();
//        myCar.frontR = new KumhoTire();
//
//        myCar.run();
        Car2 myCar = new Car2();

        myCar.run();

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
    }
}
