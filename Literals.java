public class Literals {

    public static void main(String[] args) {
        
        /* ===============================
           1. INTEGER LITERALS
           =============================== */

        int decimal = 100;      // Decimal literal (base 10)
        int binary = 0b1010;    // Binary literal (base 2)
        int octal = 012;        // Octal literal (base 8)
        int hex = 0x64;         // Hexadecimal literal (base 16)

        System.out.println("Decimal : " + decimal);
        System.out.println("Binary  : " + binary);
        System.out.println("Octal   : " + octal);
        System.out.println("Hex     : " + hex);


        /* ===============================
           2. FLOATING POINT LITERALS
           =============================== */

        float floatValue = 10.5f;   // 'f' is mandatory for float
        double doubleValue = 99.99; // Default type is double

        System.out.println("Float  : " + floatValue);
        System.out.println("Double : " + doubleValue);


        /* ===============================
           3. CHARACTER LITERALS
           =============================== */

        char letter = 'A';        // Single character
        char number = '7';        // Character '7', not number 7
        char symbol = '#';        // Special symbol
        char unicode = '\u0041';  // Unicode value for 'A'

        System.out.println("Letter  : " + letter);
        System.out.println("Number  : " + number);
        System.out.println("Symbol  : " + symbol);
        System.out.println("Unicode : " + unicode);


        /* ===============================
           4. STRING LITERALS
           =============================== */

        String name = "Sayali";        // String literal
        String message = "Hello Java"; // Text inside double quotes

        System.out.println("Name    : " + name);
        System.out.println("Message : " + message);


        /* ===============================
           5. BOOLEAN LITERALS
           =============================== */

        boolean isJavaEasy = true;   // true literal
        boolean isHard = false;      // false literal

        System.out.println("Java Easy? : " + isJavaEasy);
        System.out.println("Hard?      : " + isHard);


        /* ===============================
           6. NULL LITERAL
           =============================== */

        String city = null;   // null means no object reference

        System.out.println("City : " + city);
    }
}
