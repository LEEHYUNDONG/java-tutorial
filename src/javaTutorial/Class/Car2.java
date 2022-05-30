package javaTutorial.Class;

public class Car2 {
    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;
    int speed;

    Car2 (){

    }
    Car2(String model){
        this.model = model;
    }
    Car2(String model, String color){
        this.model = model;
        this.color = color;
    }
    Car2(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car2(String company, String model, String color, int maxSpeed){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
