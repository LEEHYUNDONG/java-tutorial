package javaTutorial.Inheritance;

import java.awt.*;

public class ChildeEx {
    public static void main(String[] args) {
        Parent p = new Child();
        p.field1 = "data1";
        p.method1();
        p.method2();
        /*
        p.filed2 = "data2";
        p.method3();
         */
        Child c = (Child) p;
        c.field2 = "yyy";
        c.method3();
        c.method2();
    }
}
//ER 키워드를 붙여서 부모 메소드를 호출할 수 있다.