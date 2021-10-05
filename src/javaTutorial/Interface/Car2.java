package javaTutorial.Interface;

public class Car2 {
    Tire [] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
    };

    void run(){
        for(Tire a : tires){
            a.roll();
        }
    }
}
