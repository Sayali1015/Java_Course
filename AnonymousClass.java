class A{
    public void show(){
        System.out.println("in A show");
    }

}

// class B extends A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A() //this is call a inner class because it is present inside the main method. This is also called as anonymous class because it does not have a name.
        {
            public void show(){
                System.out.println("in anonymous class show or new Show");
            }
        };
        obj.show();
    }
}
