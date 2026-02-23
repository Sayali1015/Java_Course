
//Collection Framework in Java is used group the elements and store them in a single unit.
//Collection Api is a concept of Java that provides a set of classes and interfaces to work with groups of objects. It includes various data structures like lists, sets, queues, and maps, which allow developers to store and manipulate collections of data efficiently.
//Collection is an interface 
//Collections is a class.
//types of collection List, Set, Queue, Map
//<type> is called as a generic type. It is used to specify the type of elements that a collection can hold. For example, Collection<Integer> means that the collection can only hold Integer objects. This helps to ensure type safety and prevents runtime errors when working with collections.

import java.util.ArrayList;
import java.util.Collection;

public class collectionAPI {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(9);
        nums.add(4);

        for(int n : nums){
            System.out.println(n);
        }
        
    }
}
