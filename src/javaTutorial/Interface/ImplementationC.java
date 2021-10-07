package javaTutorial.Interface;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("Implementations methodA 실행");
    }

    @Override
    public void methodB() {
        System.out.println("Implementations methodB 실행");
    }
    public void methodC(){
        System.out.println("Implementations methodC 실행");
    }
}
