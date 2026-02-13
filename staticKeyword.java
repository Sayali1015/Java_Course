class Mobile
{
    String brand;
    int price;
    static String name; //static varibale is shared to all the objects if we try to change obj1 name from smartphone to phone in output we will get both obj1 and obj2 name chnaged to phone

public void show(){ //here in non Static methods we can use static variables "name is used"

    System.out.println(brand + " : " + price + " : "+ name);
}

}
public class staticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500000;
        Mobile.name = "SmartPhone"; // Static varibale should be called with there classname name not with the object, we can call by object but then it will give to warning 

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 890000;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";
        obj1.show();
        obj2.show();
    }
}
// inshort static keyword means you are make something as a class member not a object member so static name here belong to the class not to the object



