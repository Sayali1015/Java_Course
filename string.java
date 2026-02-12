//String are constant once a data generated we cannot change the data
//Mutable String - change
//Immutable String - unchnage / cannot change , by default strings are immutable

//to use mutable strings we have two different classes in java those are : String buffer or String builder
//both are very similar and both provide you a way to implement a mutable string 
public class string {
    public static void main(String[] args) {
        String name = new String("Sayali"); // Syntax to create a string variable

        // String name = "Sayali" //we can use it directly behind it will create the object automatically

        name = name + " Sanjay"; // append ,in here not changing the existing string
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("hello" + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Rajwade"));
    }
}
