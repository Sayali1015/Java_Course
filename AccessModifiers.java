//Public access modifier allows the member to be accessed from any class in the same package or different package. It is the most permissive access level. When a member is declared as public, it can be accessed from any other class, regardless of its location in the project. This means that you can access a public variable, method, or constructor from any class in your application, making it widely accessible and usable across different parts of your codebase.
//Private access modifier restricts the access of a member to within the class it is declared in. When a member is declared as private, it cannot be accessed from any other class, including subclasses. This means that you can only access a private variable, method, or constructor from within the same class where it is defined. Private members are typically used to encapsulate data and behavior that should not be exposed to other classes, ensuring that they can only be accessed and modified through controlled methods within the class.
//Protected access modifier allows the member to be accessed within the same package and also in subclasses in different packages. When a member is declared as protected, it can be accessed from any class in the same package, as well as from subclasses in different packages. This means that you can access a protected variable, method, or constructor from any class that is in the same package as the class where it is defined, as well as from any subclass that extends that class, even if the subclass is in a different package. Protected members are often used to allow controlled access to certain members while still providing some level of encapsulation.
//Default access modifier (also known as package-private) allows the member to be accessed within the

public class Main {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        System.out.println(obj.mark); //accessing public variable mark from Class1
        System.out.println(obj.getId()); //accessing private variable id through public method getId() in Class1
        System.out.println(obj.name); //accessing protected variable name from Class1   
        System.out.println(obj.age); //accessing default variable age from Class1

    }
  
}
