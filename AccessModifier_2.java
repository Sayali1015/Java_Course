public class Class1 {
      public int mark = 100;//public access modifier.this variable can be accessed from any class in the same package or different package.
      private long id = 1234567890L;//private access modifier.this variable can only be accessed within this class
      protected String name = "Sayali";//protected access modifier.this variable can be accessed within the same package and also in subclasses in different packages.
      int age = 25;//default access modifier.this variable can be accessed within the same package but not from different packages.

      int getId() {
          return (int) id; //method to access private variable id within the class
      }
}

