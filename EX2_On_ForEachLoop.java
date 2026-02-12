
class Student{
    int rollno;
    String name;
    double marks;
}

public class EX2_On_ForEachLoop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name= "Sakarabai";
        s1.marks = 61.48;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name= "Shantabai";
        s2.marks = 68.66;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name= "Sagunabai";
        s3.marks = 56.45;

        Student s4 = new Student();
        s4.rollno = 4;
        s4.name= "Subhdrabai";
        s4.marks = 76.99;


        Student students[] = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        //Normal For Loop
        for(int i=0; i < students.length; i++){
            System.out.println(students[i].name + " : "+ students[i].marks);
        }

        //Enhanced For Loop(ForEach)
        for(Student stud : students){
             System.out.println(stud.name + " : "+ stud.marks+ " : "+ stud.rollno);
        }
    }
}
