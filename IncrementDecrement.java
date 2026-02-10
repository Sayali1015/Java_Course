public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 10;

        /* ===============================
           POST-INCREMENT (a++)
           =============================== */
      System.out.println("Value is: "+a);
        System.out.println("Post-Increment:");
        System.out.println("a++ = " + (a++));  
        // First prints the value, then increases by 1
        // Output: 10
        // a becomes 11

        System.out.println("After a++ : " + a); // 11


        /* ===============================
           PRE-INCREMENT (++a)
           =============================== */

        System.out.println("\nPre-Increment:");
        System.out.println("++a = " + (++a));
        // First increases the value, then prints
        // a becomes 12
        // Output: 12


        /* ===============================
           POST-DECREMENT (a--)
           =============================== */

        System.out.println("\nPost-Decrement:");
        System.out.println("a-- = " + (a--));
        // First prints the value, then decreases by 1
        // Output: 12
        // a becomes 11

        System.out.println("After a-- : " + a); // 11


        /* ===============================
           PRE-DECREMENT (--a)
           =============================== */

        System.out.println("\nPre-Decrement:");
        System.out.println("--a = " + (--a));
        // First decreases the value, then prints
        // a becomes 10
        // Output: 10
    }
}
