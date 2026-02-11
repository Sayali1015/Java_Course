// Object Oriented Programming
// Here in this we have Object and class
// Object :- Real World Entity (It has Properties and Behaviour)
// Class :- Blueprint of an object

class Calci {
    String heading = "Calculate with Fun!!" ;

    public int add(int n1 , int n2){
        int r = n1 + n2;
        return r;
    }

    public int sub (int n1 ,int n2){
        int s = n1 - n2;
        return s; 
    }

    public int multi (int n1 , int n2){
        int m = n1 * n2;
        return m;
    }

    public int div (int n1, int n2){
        int d = n1 / n2;
        return d;
    }

    public int mod (int n1, int n2){
        int md = n1 % n2;
        return md;
    }

}

public class Oops {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        Calci calc = new Calci(); //calc is a reference variable here. new is the keyword to create object.
            int result = calc.add(num1 , num2);
            int result1 = calc.sub(num1 , num2);
            int result2 = calc.multi(num1 , num2);
            int result3 = calc.div(num1 , num2);
            int result4 = calc.mod(num1 , num2);


        
            System.out.println(calc.heading);
            System.out.println("Addition of " +num1+ " and " + num2 + " " + "is: " + result);
            System.out.println("Subtraction of " +num1+ " and " + num2 + " " + "is: " + result1);
            System.out.println("Multiplication of " +num1+ " and " + num2 + " " + "is: " + result2);
            System.out.println("Division of " +num1+ " and " + num2 + " " + "is: " + result3);
            System.out.println("Modulous of " +num1+ " and " + num2 + " " + "is: " + result4);

    }
}
