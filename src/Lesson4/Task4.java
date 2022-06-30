package Lesson4;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(determineNumber(3213212));
    }


    public static String determineNumber(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}

