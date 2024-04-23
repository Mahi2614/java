public class Oop2 {// constructor
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("mahi");
        // Student s3 = new Student(123);
        // System.out.println(s1.name);
        s1.name = "mahi";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constuctor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks = s1.marks;
         
        
    }

    Student() {
        marks = new int[3];
        System.out.println("constuctor is called");

    }

    Student(String name) {
        marks = new int[3];
        this.name = name;

    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}