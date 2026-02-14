//PPINT TO REMEMBER : every constructor in java has a method even if you dont mention. And that method is super. first statement in every constructor.
//Super means : Call the constructor of super class.

class A extends Object{ //super class , here in java every class extends object class if we mention it or not.

    public A(){
        super();
        System.out.println("in A's Constructor");
    }

     public A(int n){
         super();
        System.out.println("in A's Parameterized Constructor");
    }
}

class B extends A{ //subclass
    public B(){
         super();
        System.out.println("in B's Constructor");
    }

    public B(int n){
         this();
        System.out.println("in B's Parameterized Constructor");
    }
}

public class supreKeyword {
    public static void main(String[] args) {
        B obj = new B(5);
      
    }
}
