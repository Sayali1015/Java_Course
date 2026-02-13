
class Human{
String name ="kunal";
    private String colour = "Pink"; 
    private long phone_number = 9021628100l;
    private String surname; // this surname variable here is the global or instance varibale 
    private String address; // when ever we have same variable name of instance variable/ global variable and local variable the we use this keyword to pint towards gobal variable as first priority is given to the local variable

    public String getColour(){
    return colour;
    }

    public long getPhoneNum(){
        return phone_number;
    }

    public void setSurname(String surname){ // this s varibale here is a local variable 
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }
}

  


public class thisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setSurname("Nimbalkar");
        obj.setAddress("Ramnagar, Rathani Pune - 17");
        System.out.println(obj.getColour());
        System.out.println(obj.getPhoneNum());
        System.out.println(obj.getSurname());
        System.out.println(obj.getAddress());
    }
}
