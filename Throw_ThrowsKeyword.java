public class Throw_ThrowsKeyword {

    public static void main(String[] args) {
        int i =20; //Normal Statement
        int j =0;
      
        
        try 
        {
            j = 18/i; //Critical Statement
            if(j==0)
                throw new ArithmeticException("i dont wnat to print 0" ); //throw keyword is used to throw an exception explicitly. we can throw only one exception at a time. we can throw either checked or unchecked exception.
        }

        catch(ArithmeticException e) 
        {
            j = 18/i; //Critical Statement
            System.out.println("thats the default output" +e);
        }

        catch(Exception e) 
        {
            System.out.println("Something Went Wrong..." +e.getMessage());
        }
        
        System.out.println(j);
        System.out.println("Bye");

    }
}


