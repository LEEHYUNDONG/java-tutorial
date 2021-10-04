package javaTutorial.Inheritance;

public class animalEx {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        System.out.println("---");
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animalSound(new Dog());

    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
