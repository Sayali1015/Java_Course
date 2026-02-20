
abstract class Computer{
    public abstract void code();
    
}


class Laptop extends Computer{
    public void code(){
        System.out.println("code , compile and run....");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code , compile and run : Faster.........");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();  
        Computer desk = new Desktop();

        Developer sayali = new Developer();
        sayali.devApp(desk);
    }
}
