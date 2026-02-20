// enum is a special data type that enables for a variable to be a set of predefined constants. 
// The variable must be equal to one of the values that have been predefined for it. 
// Common examples include compass directions (NORTH, SOUTH, EAST, WEST) and the days of the week
// enum can be defined inside or outside a class.
// defining an enum outside a clas
enum  Status{
    Running, Failed, Pending, Success;
}


public class Enum {
    public static void main(String[] args) {
        int i =5;
        Status s = Status.Success;
        System.out.println(s.ordinal()); // ordinal() method returns the position of the enum constant in its enum declaration, where the initial constant is assigned an ordinal of zero.

        Status s1[] = Status.values();
        for(Status s2 : s1){
            System.out.println(s2 + " : " + s2.ordinal());
        }
    }
}
