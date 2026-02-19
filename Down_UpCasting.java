class A{

    public void show1(){
        System.out.println("in A show()");
    }
}

class B extends A{

    public void show2(){
        System.out.println("in B show()");
    }
}

public class Down_UpCasting {
    public static void main(String[] args) {
        
        //Type casting : is the process of converting a value from one data type to another data type. There are two types of type casting in Java: upcasting and downcasting.
        double a = 10.5;
        int b = (int) a; // this is called as downcasting because we are converting a higher data type to lower data type. This is also called as explicit type casting because we are explicitly mentioning the data type to which we want to convert.
        System.out.println(b);


        A obj = new B(); // upcasting because we are converting a lower data type to higher data type. This is also called as implicit type casting because we are not explicitly mentioning the data type to which we want to convert.
        obj.show1(); 

        B obj1 = (B) obj; // downcasting because we are converting a higher data type to lower data type. This is also called as explicit type casting because we are explicitly mentioning the data type to which we want to convert.
        obj1.show2();   
    }
}
