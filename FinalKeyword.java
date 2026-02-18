//final keyword can be used with - variables, methods and classes 
//final keyword is used to restrict the user to change the value of variable, method and class. (constant variable - final variable)



//final keyword with class:
// if we make a class final then we cannot extend it (stop inheritance)
final class Calculator{
    public void show(){
        System.out.println("in Calculator show");
    }

    // class AdvCalculator extends Calculator{ 
            // we cannot extend the final class Calculator because it is a final class
    // }

    public void add(int a, int b){
       System.out.println(a+b);
    }



    //Final keyword with method:
    // if we make a method final then we cannot override it (stop method overriding)
    class Math {
        public final void sub(int  num1, int num2){
            System.out.println(num1-num2);  
            
        }

    }

    class ScientificCalculator extends Math{ 
        // public void sub(int num1, int num2){   // will give error because we cannot override the final method sub() of class Math
            // System.out.println("by sayali");
        }
    }




public class FinalKeyword {
    public static void main(String[] args) {
        int num =8;
        num = 9; // we can change the value of num because it is not final variable
        System.out.println(num);

        //final keyword with varibale :
        final int num1 = 10; // we cannot change the value of num1 because it is a final variable
        System.out.println(num1);


        Calculator obj = new Calculator();
        obj.show();
        obj.add(10, 16);

    }
}
