
Core Java: Type Conversion & Type Casting

📌 Key Idea (Very Important)
Type Conversion (Widening) → Automatic (small → big)
Type Casting (Narrowing) → Manual (big → small)
============================================================================================================
✅ 1. Widening Type Conversion (Implicit)
public class WideningConversion {

    public static void main(String[] args) {

        byte a = 10;      // byte = 1 byte
        int b = a;        // byte → int (automatic conversion)

        // No data loss because int is bigger than byte
        System.out.println("Byte value : " + a);
        System.out.println("Int value  : " + b);
    }
}

📌 Why allowed?
Because smaller data fits safely into a larger data type.
=============================================================================================================
2. Narrowing Type Conversion (Not Allowed Automatically)

public class NarrowingError {
    public static void main(String[] args) {

        int b = 130;

        // byte a = b; ❌ Compile-time error
        // Reason: int is larger than byte (possible data loss)
    }
}

📌 Java does not allow narrowing automatically.
===============================================================================================================
✅ 3. Type Casting (Explicit Narrowing)
public class TypeCasting {

    public static void main(String[] args) {

        int b = 130;           // int value
        byte a = (byte) b;    // explicit casting

        // byte range = -128 to 127
        // 130 overflows and wraps around

        System.out.println("Int value  : " + b);
        System.out.println("Byte value : " + a);
    }
}

📌 Output Explanation
130 - 256 = -126

========================
So output will be:
Byte value : -126

====================================================================================================================
✅ 4. Your Example – Corrected & Explained
public class TypeConversion {

    public static void main(String[] args) {

        byte a = 127;     // Maximum value of byte
        int b = 12;

        // b = a;   // ✔ Widening (allowed)
        a = (byte) b;    // ✔ Explicit casting (narrowing)

        System.out.println(a);
    }
}

==================================================================================================================
✅ 5. Double → Int Casting Example (Common Interview One)
public class DoubleToInt {

    public static void main(String[] args) {

        double d = 99.99;
        int i = (int) d;   // decimal part is removed

        System.out.println("Double : " + d);
        System.out.println("Int    : " + i);
    }
}

===================
📌 Output:
Double : 99.99
Int    : 99

======================================================================================================================
🔹 Summary Table 
Conversion	Automatic	Data Loss
byte → int	    ✅ Yes	❌ No
int → double	  ✅ Yes	❌ No
int → byte	    ❌ No 	✅ Yes
double → int	  ❌ No	✅ Yes




=================================================================================================


Question : Why in the main method we have static keyword?
Ans: Because if we dont make main static, if we dont mention static keyword that means main method becomes a nonstatic method which means if you want to call main we have to first create a object of the class i.e classname i.e "Demo", that means you cannot call main without the object of demo , we know that main is the starting point of the execution if the execution is not started how can we create a object of demo so the deadlock occurs thats why we use static keyword.

===================================================================================================

Naming Convention in Java 
1. It follows Camel Casing.
2. Class and Interface name starts with Capital letter : class Calculator , Runable
3. variable and method - marks , show() (First Letter is small in varibales and methods).
4. Constants - PIE,  BRAND (All letters are capital)
5. Camel Casing - showMyMarks
6. Snake Casing - hello_world
7. Constructor - Calculator()
===================================================================================================

Packages in Java :
1. we can store the file in the package by using package keyword in the top of the code.
2. if the file is not a part the folder or the main method class is outside the folder the we can access other class present inside the package by following way:
-  import packageName ClassName;
-  Example : lets consider a package tools:
-  tools
  --Cal.java
  --AdvCal.java
-Demo.java
Then you need to access cal and advcal in demo like this :
ex:  import tools.Cal;
     import tools.AvdCal;
        public class Demo{
            public static void main(String [] args){
                Cal.obj = new Cal();
                AdvCal.obj1 = new AdvCal();
      } 
}

3.Java internally has lot of classes.
-for example : ArrayList etc
4. Whichever inbuilt class we use in java belongs to a package.
5. java.lang is bydefaulted imported in java even if we cant see it is there. System.out.print (where System belongs to lang package).Not import java.lang but import java.lang.*
6. what is this * : now in one particular folder you have multiple files and if we need or want all the files then we can simply use * 

=========================================================================================================================================================================================
Access Modifiers in Java

<img width="400" height="400" alt="Screenshot 2026-02-17 213244" src="https://github.com/user-attachments/assets/44e72eef-c6f0-4dea-9814-8704f93e8f89" />

===========================================================================================================================================================================================

Types of Interface:
we can divide it in three parts :
1. Normal Interface.
2. Functional Interface. / SAM (Single Abstract Method)
3. Marker Interface.


1. Normal Interface : In interface we can only declare methods. All the methods in interface are public abstract.
2. Whenever we have interface with 2 or more methods is called as normal interface.
   example : interface ABC {
       void show();
       void display();
   }

2.Functional Interface. / SAM (Single Abstract Method) : This simply means if you have the interface lets consider the interface name ABC and in this interface if you have only one method that is called a single Abstract method interface i.e SAM and we can also call it as a funtional interface 
    example : inteface ABC{
    void show();
    }

3.Marker Interface: A marker interface is a interface which has no methods / a blank interface 
    question : why someone will create a blank interface : 
    Answer: to update something to the complier (serialization which means we can take the object and can you can store the values of the object in your hard drive) 
    Example : interface ABC{
    }

=====================================================================================================================================================================================================================

Exceptions : Exceptions are nothing but run time errors
Types of Errors:
1. Compile Time Error
2. Run Time Error -- Exceptions can be handle
3. Logical Error

====================================================================================================

Hierarchy Exception:
  Object
    |
Throwable : Error and Exception
              |          |-------------- Runtime Exception  ---------------------------------SQL Exception
        ThreadDeath                |-- Arithematic Exception                       |--IOException (Checked Exceptions)
        IOError                    |-- ArrayIndexOutOfBound                  
Virtual Machine Error              |-- NullPointException
OutofMemory                        (this are called Unchecked Exceptions)
(All this errors cannot be handled)

================================================================================================================================

LVTI - Local Variable Type Inference (Update in java 10) we can have var keyword in java in the place of DataType
Example : older way : int num = 9;
                   New way :  var num = 9;
And this is applicable only for local variable

If we want to use a var keyword it is compulsary to initizate it without initizating it will give you an error 
Example : int c;
                   var c;  *//error*

We can use var Keyword as variable name , keyword as well but cannot give var as a classname 
Example : int var = 10; ✅
                   var = 10; ✅
                    class var{
                      }❌


    

