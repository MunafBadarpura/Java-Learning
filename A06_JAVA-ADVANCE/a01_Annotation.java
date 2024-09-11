
@FunctionalInterface  // it means interface have only one method
interface Car{
    void show();
    // void show2();  //it is not allowed
}

class A{
    public void showDataWhichBelongsToThisClass(){
        System.out.println("in A Show");
    }
}

class B extends A{
    @Override
    public void showDataWhichBelongsToThisClass(){
        System.out.println("in B Show");
    }
}

class a01_Annotation{
    public static void main(String[] args) {
        B a = new B();
        a.showDataWhichBelongsToThisClass();
    }
}