

class Human{
    private int age; 
    private String name; 
    

    public Human(){ // (default Constructors) this is a constructor it is a special method, it does not have a return type and the constructor name should be same as class name.
         age = 12;
         name = "Joy";
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(int a, String n){ //Parameterized Constructors
        age = a;
        name = n;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    
    public void setname(String name){ 
        this.name = name;
    }

    

}

public class Constructors {
    public static void main(String[] args) {
        Human obj = new Human(); // every time we create the object it will call the constructor.
        Human obj1 = new Human(18, "Sayali");
        Human obj2 = new Human( "Sayali");


        System.out.println(obj.getAge() + " : " + (obj.getName())); // if we dont want a defalut value then we use constructor or can say this application can be used by the age of 12 then we can use constructor
         System.out.println(obj1.getAge() + " : " + (obj1.getName()));
         System.out.println(obj2.getName());

        // obj.setAge(21);
        // System.out.println(obj.getAge());
        // obj.setname("Om");
        // System.out.println(obj.getName());
        
       
    }
}


