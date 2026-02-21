@FunctionalInterface
interface A{
    void show( int i, int j);
}

// class B implements A{
//     public void show(){
//         System.out.println("This is class B");
//     }
// }

public class functionalinterface {
    public static void main(String[] args) {
        A obj = (int i , int j) ->  System.out.println("in show " + i + " " + j); // if here i have only 1 variable then there is no need of mentioning () brackets and no datatype of the varibale ex : A obj = i -> System.out.println("in show " + i);
        obj.show(5, 10);
    }
}


//In java 8 we got an amazaing feature called lambda expression.
//Lambda expression can be used only with functional interfaces.
//Lambda expression is a short form of anonymous class. By using -> operator we can create a lambda expression.
