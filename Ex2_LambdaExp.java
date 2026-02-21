@FunctionalInterface
interface A{
     int add(int i, int j);
    
}

public class Ex2_LambdaExp {
    public static void main(String[] args) {
        A obj = ( i,  j) -> i+j;
        
        int result = obj.add(5, 10);
        System.out.println("Addition: " + result);
    }
}

//Lambda expression works with only functional interface.
