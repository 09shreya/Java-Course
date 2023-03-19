class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.rollno= 1;
        s1.name=" Shreya";
        s1.marks= 91;

        Student s2= new Student();
        s2.rollno= 2;
        s2.name=" Shivam";
        s2.marks= 81;

        Student s3= new Student();
        s3.rollno= 3;
        s3.name=" Shiv";
        s3.marks= 90;

        Student s4= new Student();
        s4.rollno= 4;
        s4.name=" Priya";
        s4.marks= 87;

        Student students[]=new Student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;


        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno + ":" + students[i].name + ":  " + students[i].marks);
        }
        System.out.println("Through for - each loop");
        for(Student s: students){
            System.out.println(s.rollno + ":" + s.name + ":  " + s.marks);
        }
    }
}
