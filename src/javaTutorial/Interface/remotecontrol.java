package javaTutorial.Interface;

public interface remotecontrol {
    public int MAX_VOL = 100;
    public int MIN_VOL = 0;
    public void turnOn();
    public void turnOff();
    public void setVol(int v);

    default void setMute(boolean m){
        if (m) {
            System.out.println("무음 처리합니다.");
        }else{
            System.out.println("무음 해제합니다.");
        }
    }
    static void changeBattery(){
        System.out.println("건전지를 교체합니다.");
    }
}
