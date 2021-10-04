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
