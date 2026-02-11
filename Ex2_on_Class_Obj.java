
class Computer {
    
    public void playMusic(){
        System.out.println("Music Playing....");
    }

    public String getMePen(int cost){
        if (cost >=10){
            return "Have a Pen";
        }else {
            return "Pen Cost 10rs, Cannot have pen";
        }
    }
}


public class Ex2_on_Class_Obj {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(10);
        System.out.println(str);
    }
}
