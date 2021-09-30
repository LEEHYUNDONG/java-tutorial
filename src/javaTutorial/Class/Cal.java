package javaTutorial.Class;

public class Cal {
    int plus(int x, int y){
        return x + y;
    }
    double avg(int x, int y){
        return (double)(x + y) / 2;
    }
    void execute(){
        double res = avg(7, 10);
        System.out.println("실행 결과 :" + res);
    }


}
