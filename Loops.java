/*
 Types of Looping Statements in Java
 1. for loop
 2. while loop
 3. do-while loop
 4. enhanced for loop (for-each)
*/

public class Loops {

    public static void main(String[] args) {

        /* ===============================
           1. FOR LOOP
           =============================== */

        // for(initialization; condition; increment/decrement)
        for (int i = 1; i <= 5; i++) {
            System.out.println("FOR LOOP: i = " + i);
        }


        /* ===============================
           2. WHILE LOOP
           =============================== */

        int j = 1;

        // Executes while condition is true
        while (j <= 5) {
            System.out.println("WHILE LOOP: j = " + j);
            j++; // increment
        }


        /* ===============================
           3. DO-WHILE LOOP
           =============================== */

        int k = 1;

        // Executes at least once even if condition is false
        do {
            System.out.println("DO-WHILE LOOP: k = " + k);
            k++; // increment
        } while (k <= 5);


        /* ===============================
           4. ENHANCED FOR LOOP (FOR-EACH)
           =============================== */

        int[] numbers = {10, 20, 30, 40, 50};

        // Used to iterate over arrays or collections
        for (int num : numbers) {
            System.out.println("FOR-EACH LOOP: num = " + num);
        }
    }
}
