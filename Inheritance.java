
//Example of Multi level Inheritance
//When there are aonly 2 classes then it is called as Single level inhertitance.
//In java the interview Questions ? : - do java supports multiple inheritance but it is maybe possible with interface
public class Inheritance  {
    public static void main(String[] args) {
        Calc_Inheritance_ex obj = new Calc_Inheritance_ex();
        int r1= obj.add(15, 3);
        int r2= obj.sub(89, 5);
        int r3= obj.multi(11, 7);
        int r4= obj.div(27, 3);
        double r5= obj.power(7, 3);
        double r6 = obj.mod(15 , 3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);



    }
}
