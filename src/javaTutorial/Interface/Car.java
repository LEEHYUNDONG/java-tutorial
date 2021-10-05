package javaTutorial.Interface;

public class Car {
    Tire frontL = new HankookTire();
    Tire frontR = new HankookTire();
    Tire backL = new HankookTire();
    Tire backR = new HankookTire();

    void run(){
        frontL.roll();
        frontR.roll();
        backL.roll();
        backR.roll();
    }
}
