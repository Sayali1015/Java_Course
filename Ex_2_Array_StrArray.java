
class Student
{
    int rollno;
    String name;
    int marks;
}

public class Ex_2_Array_StrArray {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 16;
        s1.name = "Sayali";
        s1.marks = 82;

        Student s2 = new Student();
        s2.rollno = 17;
        s2.name = "Smital";
        s2.marks = 62;

        Student s3 = new Student();
        s3.rollno = 19;
        s3.name = "Komal";
        s3.marks = 45;

        // System.out.println(s3); //Here we will get the address 
        // System.out.println(s3.name + " : "+ s3.marks);

        Student students[] = new Student[3]; 
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++){
        System.out.println(students[i].name + " : " 
        + students[i].marks + " : " 
        + students[i].rollno);
}


        // int nums[] = new int[4];
        // nums[0] = 5;
        // nums[1] = 3;
        // nums[2] = 2;
        // nums[3] = 9;

        // for(int i =0; i < nums.length; i++){
        //     System.out.print(nums[i] + " ");
        // }
   
    }
}
