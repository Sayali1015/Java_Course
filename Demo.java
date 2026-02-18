//Polymorphism: same name but different forms 
//same obj object but it is behaving differently with different objects of different classes
//Runtime polymorphism: method overriding(we are not sure when you comiple code at that point we are not sure obj.show() will call which shoe method of which class it will be decided at runtime thats why we call it as runtime polymorphism)
//All this concept is called as dynamic method dispatch 
//this is possible only when we have inheritance and method overriding
class A{
    public void show(){
       System.out.println("in A show");
    }
}

class B extends A{
    public void show(){
       System.out.println("in B show");
    }
}

class C extends A{
    public void show(){
       System.out.println("in C show");
    }
}


class Demo{
    public static void main(String[] args) {
        A obj = new A(); 
        obj.show();

        obj = new B(); 
        obj.show();

        obj = new C();
        obj.show();
    }
}
