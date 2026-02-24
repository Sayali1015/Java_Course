import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,2,1,7,8);
        Stream <Integer> s1 = nums.stream();

        // for (int i =0; i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

                        //OR

        // for (int n : nums){
        //     System.out.println(n);
        // }

                        //OR

    //this is the for each method 
        nums.forEach(n -> System.out.println(n));

        // int sum =0;
        // for(int n : nums){
        //     if(n % 2 == 0){
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);

    }
}
