

public class Exceptions {
    public static void main(String[] args) throws Exception {
        int i = 2; //Normal Statement
        int j =0;
        int [] nums = new int[5];
        String str = null;
        
        try //try block is used to wrap the critical statement which may throw an exception
        {
            j = 18/i; //Critical Statement
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]); 
        }

        catch(ArithmeticException e) //catch block is used to handle the exception thrown by the try block. this block will execute only when there is an exception in the try block.
        {
            System.out.println("Cannot Divide By Zero.");
        }

        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Stay in your limit.");
        }

        catch(Exception e) // this block will at bottom because it is the parent class of all the exceptions and it will catch all the exceptions which are not caught by the above catch blocks.
        {
            System.out.println("Something Went Wrong..." +e.getMessage());
        }
        
        System.out.println(j);
        System.out.println("Bye");

    }
}
