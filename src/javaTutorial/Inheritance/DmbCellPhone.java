package javaTutorial.Inheritance;

public class DmbCellPhone extends Cellphone{
    int channel;

    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
    void turnOnDmb(){
        System.out.println("채널" + channel + "번 dmb 방송 수신.");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널"+ channel + "으로 바꿉니다.");
    }
    void turnOffDmb(){
        System.out.println("티비를 끕니다.");
    }
}
