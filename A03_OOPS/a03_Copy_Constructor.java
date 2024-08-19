public class a03_Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "munaf";
        s1.age = 18;
        s1.rollNo = 3;
        s1.marks[0] = 80;
        s1.marks[1] = 70;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s1.marks[0] = 100;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    int marks[];

    //  Shallow Copy Constuctor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    // }

    //  Shallow Copy Constuctor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor Called");
    }
}
