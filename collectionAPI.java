
//Collection Framework in Java is used group the elements and store them in a single unit.
//Collection Api is a concept of Java that provides a set of classes and interfaces to work with groups of objects. It includes various data structures like lists, sets, queues, and maps, which allow developers to store and manipulate collections of data efficiently.
//Collection is an interface 
//Collections is a class.
//types of collection List, Set, Queue, Map
//<type> is called as a generic type. It is used to specify the type of elements that a collection can hold. For example, Collection<Integer> means that the collection can only hold Integer objects. This helps to ensure type safety and prevents runtime errors when working with collections.

//Collection works with objects and it does not work with primitive data types. To use primitive data types with collections, we can use wrapper classes like Integer for int, Double for double, etc.<Integer> is a wrapper class for int.
//List works with index ans it allows duplicate values.
//Set does not work with index and it does not allow duplicate values. hashset is a class that implements set interface.it does not maintain any order of elements. 
//Map wotks with key and value pairs. It does not allow duplicate keys but it allows duplicate values. HashMap is a class that implements Map interface. It does not maintain any order of elements.


//Differnec between HashMap and HashTable

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

import java.util.HashMap;
import java.util.Map;

public class collectionAPI {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(6);
        // nums.add(9);
        // nums.add(4);
        // nums.add(6);

      
        // for(int n : nums){
        //     System.out.println(n);
        // }


        Map<String, Integer> students = new HashMap<>();
        students.put("Sayali",  89);
        students.put( "Durvesh",  90);
        students.put( "Kunal",  98);
        students.put( "Diksha",  95);
        students.put("Sayali", 99);

        System.out.println(students);
        System.out.println(students.get("Sayali"));
        System.out.println(students.keySet());

        for(String name : students.keySet()){
            System.out.println(name + " : "+ students.get(name));
        }

    }
}
