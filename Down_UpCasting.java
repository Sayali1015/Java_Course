public class Down_UpCasting {
    public static void main(String[] args) {
        
        //Type casting : is the process of converting a value from one data type to another data type. There are two types of type casting in Java: upcasting and downcasting.
        double a = 10.5;
        int b = (int) a; // this is called as downcasting because we are converting a higher data type to lower data type. This is also called as explicit type casting because we are explicitly mentioning the data type to which we want to convert.
        System.out.println(b);
    }
}
