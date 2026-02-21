//annotations are used to provide metadata about the code. 
//They can be used to give information about the code, such as who wrote it, when it was last modified, and what it does.
//Annotations simply means a supplement to the compiler or the runtime to provide information about the code.


//@Deprecated
class A{
 public void showTheDataWhichBelongsToThisClass(){
    System.out.println("This is class A");
 }
}

class B extends A
{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
    System.out.println("This is class B");
    }  

}


public class annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
