public class WrapperClass {
    public static void main(String[] args) {
        int num =7;
        Integer num1 =new Integer(8); // this is called as wrapper class because it is wrapping the primitive data type into an object. This is also called as boxing because we are converting a primitive data type to an object.
        Integer num2 = 9; // this is called as autoboxing because we are automatically converting a primitive data type to an object without explicitly mentioning the data type to which we want to convert.
        System.out.println(num1);
        System.out.println(num2);

        int num3 = num1.intValue(); // this is called as unboxing because we are converting an object to a primitive data type. This is also called as explicit unboxing because we are explicitly mentioning the data type to which we want to convert.
        int num4 = num2; // this is called as autounboxing because we are automatically converting an object to a primitive data type without explicitly mentioning the data type to which we want to convert.
        System.out.println(num3);   
        System.out.println(num4);

        String str = "12";
        int num5 = Integer.parseInt(str); // this is called as parsing because we are converting a string to a primitive data type. This is also called as explicit parsing because we are explicitly mentioning the data type to which we want to convert.
        System.out.println(num5*2);

    }
}
