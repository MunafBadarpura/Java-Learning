package Generics;

enum Operation{
    ADD, SUBTARCT, MULTIPLY, DIVIDE;

    public <T extends Number> float apply(T a, T b){
        switch (this) {
            case ADD:
                return a.floatValue() + b.floatValue();
            case SUBTARCT:
                return a.floatValue() - b.floatValue();
            case MULTIPLY:
                return a.floatValue() * b.floatValue();
            case DIVIDE:
                return a.floatValue() / b.floatValue();

        }
        return 0;
    }
}

public class a05_GenericsEnum {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(10,10));
        System.out.println(Operation.MULTIPLY.apply(10,10));
    }
}
