 public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        /* ===============================
           1. ARITHMETIC OPERATORS
           =============================== */

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition       : " + (a + b));   // 10 + 5 = 15
        System.out.println("Subtraction    : " + (a - b));   // 10 - 5 = 5
        System.out.println("Multiplication: " + (a * b));   // 10 * 5 = 50
        System.out.println("Division       : " + (a / b));   // 10 / 5 = 2
        System.out.println("Modulus        : " + (a % b));   // 10 % 5 = 0


        /* ===============================
           2. RELATIONAL (COMPARISON) OPERATORS
           =============================== */

        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));   // false
        System.out.println("a != b : " + (a != b));   // true
        System.out.println("a > b  : " + (a > b));    // true
        System.out.println("a < b  : " + (a < b));    // false
        System.out.println("a >= b : " + (a >= b));   // true
        System.out.println("a <= b : " + (a <= b));   // false


        /* ===============================
           3. LOGICAL OPERATORS
           =============================== */

        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));   // false
        System.out.println("x || y : " + (x || y));   // true
        System.out.println("!x     : " + (!x));       // false


        /* ===============================
           4. ASSIGNMENT OPERATORS
           =============================== */

        int c = 10;

        System.out.println("\nAssignment Operators:");
        c += 5;   // c = c + 5
        System.out.println("c += 5 : " + c);

        c -= 3;   // c = c - 3
        System.out.println("c -= 3 : " + c);

        c *= 2;   // c = c * 2
        System.out.println("c *= 2 : " + c);

        c /= 4;   // c = c / 4
        System.out.println("c /= 4 : " + c);


        /* ===============================
           5. UNARY OPERATORS
           =============================== */

        int d = 5;

        System.out.println("\nUnary Operators:");
        System.out.println("d++ : " + (d++));   // post-increment
        System.out.println("After d++ : " + d);

        System.out.println("++d : " + (++d));   // pre-increment

        System.out.println("d-- : " + (d--));   // post-decrement
        System.out.println("After d-- : " + d);

        System.out.println("--d : " + (--d));   // pre-decrement


        /* ===============================
           6. TERNARY OPERATOR
           =============================== */

        int max = (a > b) ? a : b;   // condition ? true : false

        System.out.println("\nTernary Operator:");
        System.out.println("Maximum value : " + max);


        /* ===============================
           7. BITWISE OPERATORS (Basic)
           =============================== */

        int m = 5;   // 0101
        int n = 3;   // 0011

        System.out.println("\nBitwise Operators:");
        System.out.println("m & n : " + (m & n));   // AND
        System.out.println("m | n : " + (m | n));   // OR
        System.out.println("m ^ n : " + (m ^ n));   // XOR
        System.out.println("~m    : " + (~m));      // NOT
    }
   }
 
    

