class A {

    int age;

    public void show()
    {
        System.out.println("in A show");
    }


    static class B{
        public void config(){
            System.out.println("in B config");
        }
    }
}


public class ClassInsideClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B(); // This is also called as nested class because it is present inside the outer class. B class Belongs to A class.
        // obj1.config(); // we can create an object of the inner class (B class)by using the object of the outer class(A class). (obj.new B()).

        A.B obj2 = new A.B(); // we can also create an object of the inner class (B class) by using the name of the outer class (A class) because it is a static nested class. (new A.B()). We cannot make outter class Static.
        obj2.config();
    }
}
