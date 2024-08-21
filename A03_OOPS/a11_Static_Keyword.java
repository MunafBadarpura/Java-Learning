// if we define static one time then it is same for all objects
// static block run only one time when class load no matter how many objects we create

class Student{
    int rollNo;
    int age;
    static String school; 

    static int returnPer(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    } 

    // static block
    static{
        System.out.println("static block");
    }
}

public class a11_Static_Keyword {
    public static void main(String[] args) {
        // Student.school = "asasp";  we can also access static kerword with class name
        Student s1 = new Student();
        s1.rollNo = 10;
        s1.school = "Adarsh";

        Student s2 = new Student();
        // s2.school = "Dedw";  // if we change that it change to all objects otherwise it is Adarsh
        System.out.println(s2.school);  // Adarsh


        Student s3 = new Student();
        System.out.println(s3.school); 
        System.out.println(s1.school); 
    }
}
