class a02_Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Munaf");
        Student s3 = new Student(19);
        Student s4 = new Student(19, "Munaf");

        Student s5 = new Student(s4); //copy constroctor
        s5.age = 30;
    }
}

class Student{
    String name;
    int age;

    Student(){
        System.out.println("s1 constuctor called");
    }

    // copy constroctor
    Student (Student s4){
        this.name = s4.name;
    }

    Student(String name){  // constructor
        this.name = name;
        System.out.println("s2 constuctor called");
    }

    Student(int age){  // constructor
        this.age = age;
        System.out.println("s3 constuctor called");
    }

    Student(int age, String name){  // constructor
        this.age = age;
        this.name = name;
        System.out.println("s4 constuctor called");
    }
   
}