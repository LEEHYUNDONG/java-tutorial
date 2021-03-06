package javaTutorial.Interface;

public class Television implements remotecontrol{
    private int volume;
    private boolean mute;

    public void turnOn(){
        System.out.println("Turn on the TV");
    }
    public void turnOff(){
        System.out.println("Turn off the Tv");
    }
    @Override
    public void setMute(boolean m){
        this.mute = m;
        if (m){
            System.out.println("TV muted");
        }else{
            System.out.println("TV unmuted");
        }
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
