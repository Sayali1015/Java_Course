/*
 Types of Jumping Statements in Java
 1. break
 2. continue
 3. return
*/

public class JumpingStatements {

    public static void main(String[] args) {

        /* ===============================
           1. BREAK STATEMENT
           =============================== */

        // break is used to terminate the loop or switch
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break; // exits the loop when i becomes 5
            }

            System.out.println("BREAK: i = " + i);
        }


        /* ===============================
           2. CONTINUE STATEMENT
           =============================== */

        // continue skips the current iteration
        for (int j = 1; j <= 5; j++) {

            if (j == 3) {
                continue; // skips printing when j is 3
            }

            System.out.println("CONTINUE: j = " + j);
        }


        /* ===============================
           3. RETURN STATEMENT
           =============================== */

        // return is used to exit from a method
        System.out.println("Before return statement");

        return; // exits the main method

        // This line will never execute
        // System.out.println("After return statement");
    }
}
 
    

