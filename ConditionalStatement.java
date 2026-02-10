/*
 Types of Conditional Statements in Java
 1. if
 2. if-else
 3. else-if ladder
 4. nested if
 5. switch
*/

public class ConditionalStatement {

    public static void main(String[] args) {

        /* ===============================
           1. IF STATEMENT
           =============================== */

        int age = 20;

        if (age >= 18) {
            System.out.println("IF: You are eligible to vote");
        }


        /* ===============================
           2. IF - ELSE STATEMENT
           =============================== */

        int number = 7;

        if (number % 2 == 0) {
            System.out.println("IF-ELSE: Even number");
        } else {
            System.out.println("IF-ELSE: Odd number");
        }


        /* ===============================
           3. ELSE - IF LADDER
           =============================== */

        int marks = 85;

        if (marks >= 90) {
            System.out.println("ELSE-IF: Grade A");
        } else if (marks >= 75) {
            System.out.println("ELSE-IF: Grade B");
        } else if (marks >= 60) {
            System.out.println("ELSE-IF: Grade C");
        } else {
            System.out.println("ELSE-IF: Fail");
        }


        /* ===============================
           4. NESTED IF
           =============================== */

        boolean hasId = true;
        if (age >= 18) {
            if (hasId) {
                System.out.println("NESTED IF: Entry allowed");
            } else {
                System.out.println("NESTED IF: ID required");
            }
        } else {
            System.out.println("NESTED IF: Under age");
        }


        /* ===============================
           5. SWITCH STATEMENT
           =============================== */

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("SWITCH: Monday");
                break;

            case 2:
                System.out.println("SWITCH: Tuesday");
                break;

            case 3:
                System.out.println("SWITCH: Wednesday");
                break;

            case 4:
                System.out.println("SWITCH: Thursday");
                break;

            default:
                System.out.println("SWITCH: Invalid day");
        }
    }
}
