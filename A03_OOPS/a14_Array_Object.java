class Student{
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class a14_Array_Object {
    public static void main(String[] args) {
        Student s1 = new Student("munaf", 18, 80);
        Student s2 = new Student("hasan", 2, 85);
        Student s3 = new Student("afnan", 19, 89);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].marks);
        }


    }
}
