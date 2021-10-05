package javaTutorial.Interface;

public class Television implements remotecontrol{
    private int volume;

    public void turnOn(){
        System.out.println("Turn on the TV");
    }
    public void turnOff(){
        System.out.println("Turn off the Tv");
    }
    public void setVol(int v){
        if (volume > remotecontrol.MAX_VOL){
            this.volume = remotecontrol.MAX_VOL;

        }else if (volume < remotecontrol.MIN_VOL){
            this.volume = remotecontrol.MIN_VOL;
        }else{
            this.volume = v;
        }
        System.out.println("TV Volume :"+volume);
    }
}
