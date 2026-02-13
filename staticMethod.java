
class Mobile
{
    String brand;
    int price;
    static String name; 
    public void show(){ 

    System.out.println(brand + " : " + price + " : "+ name);
}

    public static void show1 (Mobile obj){
        System.out.println("in static method");
        // System.out.println(brand + " : " + price + " : "+ name); // here we cannot call a instance variable in a static method block directly but it is possible indirectly
         System.out.println(obj.brand + " : " +obj.price + " : "+ name);
    }

}
public class staticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500000;
        Mobile.name = "SmartPhone"; 

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 890000;
        Mobile.name = "SmartPhone";

        Mobile.name = "Phone";
        obj1.show();
        obj2.show();

        Mobile.show1(obj1); // we can call a static method with a class name 
    }
}





