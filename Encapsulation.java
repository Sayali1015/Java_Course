
class Human{
    String name ="kunal";
    private int age = 20; // this particular data is accessable only in the same class indirect way to access private data is by methods.
    private long phone_number = 9021628100l;
    private String caste;
    double annual_income;
    String gender;


    public int getAge(){
        return age;
    }

    public long getPhoneNumber(){
        return phone_number;
    }

    public String getCaste(){
        return caste;
    }

    public void setCaste(String c){
        caste = c;
    }

    public double getAnnualIncome(){
        return annual_income;
    }

    public void setAnnunalIncome(double a){
        annual_income = a;
    }

    public String getGender(){
     return gender;   
    }

    public void setGender(String g){
        gender = g;
    }

    }


public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.name = "Kunal";
        // obj.age = 20; 
         obj.setCaste("Maratha");
         obj.setAnnunalIncome(500000);
         obj.setGender("Female");

        System.out.println(obj.name);
        System.out.println(obj.getAge());
        System.out.println(obj.getPhoneNumber());
        System.out.println(obj.getCaste());
        System.out.println(obj.getAnnualIncome());
        System.out.println(obj.getGender());
       
    }
}
//we use getters and setters to get the data and also to set or initialize the data to the variable if not initialize its not compulsory to use both getter and setter we can use it in our requirments.