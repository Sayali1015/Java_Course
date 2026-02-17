// here AdvCal class method is overringing the method of cal class. it wtill give first priority to the object class which have being created.
class Cal{
    public int add(int n1 , int n2){
        return n1+n2;
    }
}

class AdvCal extends Cal{
    public int  add(int n1 , int n2){
       return n1+n2+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
         AdvCal obj = new AdvCal();
         int r1 =  obj.add(15, 4);
         System.out.println(r1);
    }
}
