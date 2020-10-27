package src.main;

public interface TypeInterface {

    public static void main(String[] args) {
        StringLengthLambda myLambda = String::length;
        System.out.println(myLambda.getLen("Hello World!"));
    }

    interface StringLengthLambda{
        int getLen(String s);
    }
}
