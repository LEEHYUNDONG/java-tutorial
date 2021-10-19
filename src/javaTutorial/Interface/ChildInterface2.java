package javaTutorial.Interface;

public interface ChildInterface2 extends ParentInterface{
    @Override
    public default void method2() {
        System.out.println("child interface 2 method2");
    }
    public void method3();
}
