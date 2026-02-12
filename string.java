public class string {
    public static void main(String[] args) {
        String name = new String("Sayali"); // Syntax to create a string variable

        // String name = "Sayali" //we can use it directly behind it will create the object automatically
        
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("hello" + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat("Rajwade"));
    }
}
