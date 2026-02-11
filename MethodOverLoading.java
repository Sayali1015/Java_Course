//If we have same method name with different parameters the this is call as method overloading
class Calculator {
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
        System.out.println(obj.add(10, 100, 80));
        System.out.println(obj.add(89, 45));
        System.out.println(obj.add(78.88, 82));

    }
}
