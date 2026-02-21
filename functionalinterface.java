@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("This is class B");
//     }
// }

public class functionalinterface {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("This is class B");
            }
        };
        obj.show();
    }
}


//In java 8 we got an amazaing feature called lambda expression.
//Lambda expression can be used only with functional interfaces.
