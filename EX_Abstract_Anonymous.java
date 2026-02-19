

abstract class A{
    public abstract void show();
    public abstract void display();
}


public class EX_Abstract_Anonymous {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }

            public void display() {
                System.out.println("in new display");
                
            }
        };
        obj.show();
        obj.display();
    }
}
