public class stringBuffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer(" Sayali "); // in this we will have a straing which is mutable(change), 
        //What StringBuffer Does? :- StringBuffer will give you a buffer size which is of 16 bytes 
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());
        sb.append(" Rajwade");
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.insert(0, "Hello");
        System.out.println(sb);
        sb.setLength(30);
        sb.ensureCapacity(100);
    }
}
