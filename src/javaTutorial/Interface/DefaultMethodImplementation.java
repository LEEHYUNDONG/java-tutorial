package javaTutorial.Interface;

public class DefaultMethodImplementation{
    public static void main(String[] args) {
        MyInterface m1 = new MyClassA();
        m1.method1();
        m1.method2(); // 디폴트 메소드 실행

        MyInterface m2 = new MyClassB();
        m2.method1();
        m2.method2();

    }
}

