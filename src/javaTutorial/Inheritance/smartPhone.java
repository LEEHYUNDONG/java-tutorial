package javaTutorial.Inheritance;

import javax.swing.text.StyleContext;

public class smartPhone extends  Phone{
    public smartPhone(String owner){
        super(owner);
    }
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
