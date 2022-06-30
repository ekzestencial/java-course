package Lesson4;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(makeNegativeAssigment(4));
    }

    static private int makeNegativeAssigment(int number) {

        if (number < 0) {
            return number;
        }
        if (number > 0) {
            return -number;
        }
        return 0;
    }

}

