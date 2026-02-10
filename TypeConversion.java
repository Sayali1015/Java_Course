public class TypeConversion {

    public static void main(String[] args) {

        byte a = 127;     // Maximum value of byte
        int b = 12;

        // b = a;   //  Widening (allowed)
        a = (byte) b;    //  Explicit casting (narrowing)

        System.out.println(a);
    }
}
