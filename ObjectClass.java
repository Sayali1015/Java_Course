class Laptop{
     String model;
     int price;
    


@Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


    //Source code action is used here 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1= new Laptop();
        obj1.model = "Dell";
        obj1.price = 50000;
        System.out.println(obj1.toString()); //if we try to print the object it will by default it will call toString method and it will print the hashcode of the objec. Even if we dont mention.

        Laptop obj2 = new Laptop();
        obj2.model = "Dell";
        obj2.price = 50000;         

        boolean result = obj1.equals(obj2); //it will compare the hashcode of the both objects and it will return false because both objects are different and they have different hashcode.            
        System.out.println(result);
    }
}
