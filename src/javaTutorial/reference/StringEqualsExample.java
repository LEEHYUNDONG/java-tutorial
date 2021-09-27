package javaTutorial.reference;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "이현동";
        String strVar2 = "이현동";

        if (strVar1 == strVar2) {
            System.out.println("참조가 같음");
        }else{
            System.out.println("참조가 다름");
        }
        if(strVar1.equals(strVar2)) {
            System.out.println("1, 2 문자열이 같습니다.");
        }
        strVar1 = null;
        System.out.println(strVar2);

        String name1 = new String("helloe");
        String name2 = new String("helloe");
        if (name2 == name2) {
            System.out.println("참조가 같음");
        }else{
            System.out.println("참조가 다름");
        }
        if(name1.equals(name2)) {
            System.out.println("1, 2 문자열이 같습니다.");
        }
        name1 = null;
        System.out.println(name2);
        System.out.println(name1);

    }
}
