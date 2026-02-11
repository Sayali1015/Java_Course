//If we have same method name with different parameters the this is call as method overloading
class Calculator {
    int num = 5; // this is a global or a instance variable which will get place inside heap area.
    public int add (int n1 , int n2, int n3){
        return n1 + n2 + n3;
    }

    public int add (int n1 , int n2){
        return n1 + n2;
    }

    public double add (double n1 , int n2){
        return n1 + n2;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        obj.num = 9;

        // System.out.println(obj.add(10, 100, 80));
        // System.out.println(obj.add(89, 45));
        // System.out.println(obj.add(78.88, 82));

        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
}
