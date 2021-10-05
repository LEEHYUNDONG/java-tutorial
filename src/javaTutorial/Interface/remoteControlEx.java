package javaTutorial.Interface;

public class remoteControlEx {
    public static void main(String[] args) {
        remotecontrol rc;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setVol(1000);
    }
}
